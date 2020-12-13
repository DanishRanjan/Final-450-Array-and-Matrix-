import java.util.*;
public class SubArrayWithSumZero {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(findsum(arr, n));
}
public static boolean findsum(int arr[],int n) {
	boolean found = false;
	int sum = 0;
	Set<Integer> set = new HashSet<>();
	for(int element: arr) {
		set.add(sum);
		sum = sum+element;
		if(set.contains(sum)) {
			found = true;
			break;
		}
//		if(found==true) {
//			return true;
//		}
	}
		return found;
	
}
}
