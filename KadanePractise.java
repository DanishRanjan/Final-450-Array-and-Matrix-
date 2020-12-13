import java.util.Scanner;

public class KadanePractise {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(kadaneAlgo(arr, n));
}

public static int kadaneAlgo(int[] arr, int n) {
	int maxSum=arr[0];
	int currentSum=arr[0];
	for(int i=1;i<n;i++) {
		currentSum = Math.max(arr[i]+currentSum, arr[i]);
		maxSum = Math.max(currentSum, maxSum);
	}
	return maxSum;
}
}
