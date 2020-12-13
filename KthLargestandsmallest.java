import java.util.*;

public class KthLargestandsmallest {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
	 arr[i] = sc.nextInt();
	}
	int k = sc.nextInt();
	Arrays.sort(arr);
	System.out.println(arr[k-1]);// smallest
	System.out.println(arr[n-k]);//largest
	
}
}
