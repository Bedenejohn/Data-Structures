package HW5;

import java.util.Scanner;

public class PrimMST {
	public static void main(String[] args){
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number of vertices: ");
		int vertices = Integer.parseInt(scan.nextLine());
		int[][] aMatrix = new int[vertices][vertices];
		System.out.println("Enter the values for the adjecency matrix such as that if vertex 1 and vertex 2 has an edge of weight 5 you would put 5 in the spot 1,2 and 2,1");
		for(int i = 0; i < vertices; i++){
			for(int j = 0; j < vertices; j++){
				System.out.println("Enter the weight for the spot " + i + " " + j);
				aMatrix[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		scan.close();
		for(int n = 0; n < vertices; n++){
			for(int m = 0; m < vertices; m++){
				System.out.print(aMatrix[n][m] + " ");
			}
			System.out.println();
		}
		int[] MST = new int[vertices];
		boolean[] vUsed = new boolean[vertices];
		int[] keys = new int[vertices];
		for(int l = 0; l < vertices; l++){
			vUsed[l] = false;
			keys[l] = Integer.MAX_VALUE;
		}
		keys[0] = 0;
		MST[0] = -1;
		for(int i = 0; i < vertices-1; i++){
			int min_index = -1;
			int min = Integer.MAX_VALUE;
			for(int k = 0; k < vertices; k++){
				if(vUsed[k] == false && keys[k] < min){
					min = keys[k];
					min_index = k;
				}
			}
			vUsed[min_index] = true;
			for(int m = 0; m < vertices; m++){
				if(aMatrix[min_index][m] != 0 && vUsed[m] == false && aMatrix[min_index][m] < keys[m]){
					MST[m] = min_index;
					keys[m]  = aMatrix[min_index][m];
				}
			}
		}
		System.out.println("Edges\tWeight");
		for(int i = 1; i < vertices; i++){
			System.out.println(MST[i] + "-" + i + " :\t" + aMatrix[i][MST[i]]);
		}

	}
}
