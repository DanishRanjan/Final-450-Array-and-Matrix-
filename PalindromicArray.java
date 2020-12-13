import java.util.*;

public class PalindromicArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(palinArray(arr, n));

	}

	public static int palinArray(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int ans = 0;
			int temp = a[i];
			while(temp>0) {
				int remainder = temp%10;
				temp = temp/10;
				ans = (ans*10)+remainder;
			}
			if(ans!= a[i]) {
				return 0;
			}
		}
		return 1;
	}
}
