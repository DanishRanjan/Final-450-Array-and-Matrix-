import java.util.*;
public class saddlePoint {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[][] arr = new int[n][n];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	System.out.println(saddle(arr));
}
public static int saddle(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			int smallestValueOfJ=0;
			for(int j=1;j<arr[0].length;j++) {
				if(arr[i][j]<arr[i][smallestValueOfJ]) {
					smallestValueOfJ = j;
				}
			}
			
			boolean flag = true;
			for(int k=0;k<arr.length;k++) {
				if(arr[k][smallestValueOfJ]>arr[i][smallestValueOfJ]) {
					flag = false;
					break;
				}
			}
			if(flag==true) {
				return arr[i][smallestValueOfJ];	
				
			}
		}
		return -1;
}
}
