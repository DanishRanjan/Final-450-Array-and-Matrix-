import java.util.*;
public class DutchNationalFlagAlgorithm {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int low = 0;
	int mid = 0;
	int high = n-1;
	int temp;
	while(mid <= high) {
		switch(arr[mid]) {
			case 0: {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				mid++;
				low++;
				break;
						
			}
			case 1:{
				mid++;
				break;
			}
			case 2:{
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
		
		}
	}
	for (int i=0; i<n; i++) {
		System.out.print(arr[i]+" ");
	}
	
	
}
}
