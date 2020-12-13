import java.util.*;
public class MergeUsingExtraSpace {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int[] arr1 = new int[m];
	int[] arr2 = new int[n];
	for(int i=0;i<m;i++) {
		arr1[i] = sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		arr2[i] = sc.nextInt();
	}
	int[] mergedArray = mergeWihtoutSpace(arr1, arr2, m, n);
	print(mergedArray);
}


public static int[] mergeWihtoutSpace (int[] a, int[] b, int m, int n) {
	int s = m+n;
	int[] merged = new int[s];
	int i=0,j=0,k=0;
	while(i<m && j<n) {
		if(a[i]<b[j]) {
			merged[k] = a[i];
			i++;
			k++;
		}
		else  {
			merged[k] = b[j];
			j++;
			k++;
		}
	}
	while(i<m) {
		merged[k] = a[i];
		i++;
		k++;
	}
	while(j<n) {
		merged[k] = b[j];
		j++;
		k++;
	}
	return merged;
}

public static void print(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
