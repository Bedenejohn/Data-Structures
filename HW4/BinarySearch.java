package HW4;

public class BinarySearch {
	public int binarySearch(int[] list, int key){
		return binarySearchHelper(list,key,0,list.length-1);
	}
	public int binarySearchHelper(int[] list, int key, int low, int high){
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(list[mid] == key)
			return mid;
		if(list[mid] > key)
			return binarySearchHelper(list,key,low,mid-1);
		else
			return binarySearchHelper(list,key,mid+1,high);
	}
}
