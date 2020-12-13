import java.util.*;
public class ThreeWayPartitioning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int a = sc.nextInt();
			int b = sc.nextInt();
			threeWayPartition(arr, a, b);
		}
	}
	public static void threeWayPartition(int arr[], int a, int b)
    {
        int left=0;
        int right = arr.length-1;
        for(int i=0;i<=right;i++) {
        	if(arr[i]<a) {
        		int temp = arr[i];
        		arr[i] = arr[left];
        		arr[left] = temp;
        		
        		left++;
        	}
        	else if(arr[i]>b) {
        		int temp = arr[i];
        		arr[i] = arr[right];
        		arr[right] = temp;
        		
        		right--;
        		i--;
        		
        	}
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
    }

}
