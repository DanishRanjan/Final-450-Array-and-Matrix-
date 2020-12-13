import java.util.*;
public class exitPointOfaMatrix {
public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			int[][] arr = new int[row][col];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int i=0;
			int j=0;
			int dir = 0;
		
				dir = (dir+arr[i][j]) % 4;
				if(dir==0) {
					j++;
				}
				else if(dir==1) {
					i++;
				}
				else if(dir==2) {
					j--;
				}
				else if(dir==3) {
					i--;
				}
				
				if(i<0) {
					i++;
					break;
				}
				else if(j<0) {
					j++;
					break;
				}
				else if(i==row) {
					i--;
					break;
				}
				else if(j==col) {
					j--;
					break;
				}
		
			System.out.println(i);
			System.out.println(j);	
		}
}
}
//1
//2 4
//0 0 0 1
//0 0 1 1
