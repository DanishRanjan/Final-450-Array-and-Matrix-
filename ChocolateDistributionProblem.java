import java.util.*;

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int noOfStudent = sc.nextInt(); 
			Arrays.sort(arr);
			int min = Integer.MAX_VALUE;
			for(int i=0;i<n+1-noOfStudent;i++) {
				int diff = arr[i+noOfStudent-1]-arr[i];
				if(diff<min) {
					min = diff;
				}
			}
			System.out.println(min);
			
		}
	}

}
