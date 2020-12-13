import java.util.*;

public class CountPairWithGIvenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(getPairsCount(arr, n, k));
	}

	public static int getPairsCount(int arr[], int n, int k) {
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int count=0;
		while(left<right) {
			if((arr[left]+arr[right])>k) {
				right--;
			}
			else if((arr[left]+arr[right])>k) {
				left++;	
			}
			else {
				if(arr[left]==arr[right]) {
					int temp = right-left+1;
					count = (temp*(temp-1)/2);
					break;
				}
				int countOfLeft = 1;
				while(left<right && arr[left]==arr[left+1]) {
					left++;
					countOfLeft++;
				}
				int countOfRight = 1;
				while(left<right && arr[right]==arr[right-1]) {
					countOfRight++;
					right--;
				}
				count = count + (countOfLeft * countOfRight);
				left++;
			}
		}
		return count;
	}
 
}






































