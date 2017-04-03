package HW4;

import java.util.Arrays;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i = 0; i < 10; i++){
			 int[] test = new int[1048576];
			 int key = (int)(Math.random()*1000000);
			 BinarySearch bSearch = new BinarySearch();
			 LinearSearch lSearch = new LinearSearch();
			 for(int j = 0; j < test.length; j++){
				 test[j] = (int)(Math.random() * 1000000);
			 }
			 
			 double tstart = System.nanoTime();
			 lSearch.linearSearch(test, key);
			 double tend = System.nanoTime();
			 System.out.print("LinearSearch " + (i+1) + " time is: " + (tend-tstart) + " nanoseconds\n");
			 Arrays.sort(test);
			 double tstart2 = System.nanoTime();
			 bSearch.binarySearch(test, key);
			 double tend2 = System.nanoTime();
			 System.out.print("BinarySearch " + (i+1) + " time is: " + (tend2-tstart2) + " nanoseconds\n");
		 }
		
	}

}
