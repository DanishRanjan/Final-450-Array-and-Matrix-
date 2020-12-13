import java.util.*;
public class MergeSort {
	public static int count=0;
public static void main(String args[]) {	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	 int[] ans = mergeSort(arr, 0, arr.length-1);
	 
	 for(int val: ans) {
		 System.out.print(val+" ");
	 }
}

public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		int k=0;
		int[] merged = new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
			else {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			merged[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			merged[k] = arr2[j];
			j++;
			k++;
		}
		
		return merged;
}

public static int[] mergeSort(int[] array, int low, int high) {
	if(low==high) {
		int[] br = new int[1];
		br[0] = array[low];
		return br;
	}
	int mid = (low+high)/2;
	int[] fh = mergeSort(array, low, mid);
	int[] sh = mergeSort(array, mid+1, high);
	
	int[] merge = mergeTwoSortedArrays(fh, sh);
	return merge;
	
}

}
