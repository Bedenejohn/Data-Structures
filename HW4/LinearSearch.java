package HW4;

public class LinearSearch {
	public int linearSearch(int[] list, int key){
		return linearSearchHelper(list,key,0);
	}
	public int linearSearchHelper(int[] list, int key, int pos){
		if(pos == list.length)
			return -1;
		if(list[pos] == key)
			return pos;
		return linearSearchHelper(list,key,pos+1);
	}
}
