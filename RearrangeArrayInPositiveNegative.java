import java.util.*;
public class RearrangeArrayInPositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = rearrangeArray(arr, n);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] rearrangeArray(int[] arr, int n) {
		int i = 0;
		int j = n-1;
		while(i<=j) {
			if(arr[i]<0 && arr[j]>0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			else if(arr[i]>0 && arr[j]<0) {
				i++;
				j--;
			}
			else if(arr[i]>0)
			{
				i++;
			}
			else if(arr[j]<0)
			{
				j--;
			}
		}
		
		if(i==0 || i==n) {
			return arr;
		}
		
		else {
			int k=0;
			while(k<n && i<n) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k = k+2;
				i++;
			}
			
			return arr;
			
	}
	}

}


//6
//2 3 -4 -1 6 -9
