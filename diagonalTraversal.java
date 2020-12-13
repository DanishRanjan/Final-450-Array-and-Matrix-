import java.util.*;
public class diagonalTraversal {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[][] arr = new int[n][n];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
	}
	System.out.println();
	for(int gap=0;gap<arr.length;gap++) {
		for(int i=0,j=gap;j<arr.length;i++,j++) {
			System.out.print(arr[i][j]+" ");
		}
	}
}
}
