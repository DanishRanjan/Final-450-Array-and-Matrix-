import java.util.*;
public class findaSpecificPairinMatrix {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[][] arr = new int[n][n];
	for(int i=0;i<arr.length;i++)
	{	for(int j=0;j<arr[0].length;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	System.out.println(specificPair(arr));
}
public static int specificPair(int[][] arr) {
//	int i=arr.length;
//	int j=arr[0].length;
	int diff = 0;
	int max = Integer.MIN_VALUE;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]>max) {
				max = arr[i][j];
			}
		}
	}
	
	int min = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]<min) {
				min = arr[i][j];
			}
		}
	}
	
	diff = max-min;
	return diff;
}
}
