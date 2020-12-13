import java.util.*;
public class MaximumProductSubarray {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(maxProduct(arr, n));
}
public static long maxProduct(int[] arr, int n) {
	if(arr==null || arr.length==0) {
		return 0;
	}
	if(arr.length==1) {
		return arr[0];
	}
	long maxProduct = 0;
	long currentProduct =1;
	for(int i=0;i<arr.length;i++) {
		currentProduct = arr[i]*currentProduct;
		maxProduct = Math.max(currentProduct, maxProduct);
		if(currentProduct == 0) {
			currentProduct = 1;
		}
	}
	currentProduct=1;
	for(int j=arr.length-1;j>=0;j--) {
		currentProduct = arr[j]*currentProduct;
		maxProduct = Math.max(currentProduct, maxProduct);
		if(currentProduct == 0) {
			currentProduct=1;
		}
	}
	
	return maxProduct;
}
}


//5
//6 -3 -10 0 2