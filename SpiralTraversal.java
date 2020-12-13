import java.util.*;
public class SpiralTraversal {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	int c = sc.nextInt();
	int[][] arr = new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	System.out.println(spirallyTraverse(arr, r, c));
}
public static ArrayList<Integer> spirallyTraverse(int matrix[][], int row, int column)
{
    List<Integer> ans = new ArrayList<>();
    int top = 0;
    int left = 0;
    int bottom = row-1;
    int right = column-1;
    int dir = 1;
    int count = row*column;
    while(left<=right && top<=bottom) {
    	if(count>0) {
    		if(dir==1) {
    			for(int i=left;i<=right;i++) {
    				ans.add(matrix[top][i]);
    				count--;
    			}
    		}
    		dir=2;
    		top++;
    		
    	}
    	if(count>0) {
    		if(dir==2) {
    			for(int i=top;i<=bottom;i++) {
    				ans.add(matrix[i][right]);
    				count--;
    			}
    		}
    		dir=3;
    		right--;
    		
    	}
    	if(count>0) {
    		if(dir==3) {
    			for(int i=right;i>=left;i--) {
    				ans.add(matrix[bottom][i]);
    				count--;
    			}
    		}
    		dir=4;
    		bottom--;
    		
    	}
    	if(count>0) {
    		if(dir==4) {
    			for(int i=bottom;i>=top;i--) {
    				ans.add(matrix[i][left]);
    				count--;
    			}
    		}
    		dir=1;
    		left++;
    		
    	}
    	
    }
   
    return (ArrayList<Integer>) ans;
}
}


//4
//4
//11 12 13 14
//21 22 23 24
//31 32 33 34
//41 42 43 44



