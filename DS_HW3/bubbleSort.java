package DS_HW3;
import java.util.*;
public class bubbleSort {
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> list){
		ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();
		int store;
		for(int i = 0; i < list2.size()-1; i++){
			for(int j = 0; j < list2.size()-i-1; j++){
				if(list2.get(j) > list2.get(j+1)){
					store = list2.get(j);
					list2.set(j, list2.get(j+1));
					list2.set(j+1,store);
				}
			}
		}
		return list2;
	}
}
