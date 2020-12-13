import java.util.*;
public class rotateAMatrixby90degree {
public static void main(String args[]) throws Exception {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[][] arr = new int[n][n];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	
	//transpose
	for(int i =0;i<n;i++) {
		for(int j=i;j<n;j++) {
			int temp = arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
	}
	
	//reverse
	for(int i=0;i<n;i++) {
		int left=0;
		int right=n-1;
		while(left<right) {
			int temp = arr[i][left];
			arr[i][left] = arr[i][right];
			arr[i][right] = temp;
		
			left++;
			right--;
		}
	}
	display(arr);	
}

public static void display(int[][] arr) {
	for(int i=0;i<arr.length;i++) {

		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
