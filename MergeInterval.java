import java.util.*;
public class MergeInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n]; 
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] merged = mergeInt(arr);
		print(merged);	
	}	
	public static int[][] mergeInt(int[][] intervals){
		if(intervals.length <= 1) {
			return intervals;
		}
		
		Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
		
		List<int[]> output_arr = new ArrayList();
		int[] currentInterval = intervals[0];
		output_arr.add(currentInterval);
		
		for(int[] interval: intervals) {
			int currentBegin = currentInterval[0];
			int currentEnd = currentInterval[1];
			int nextBegin = interval[0];
			int nextEnd = interval[1];
			
			if(currentEnd >= nextBegin) {
				currentInterval[1] = Math.max(currentEnd, nextEnd);
			}
			else {
				currentInterval = interval;
				output_arr.add(currentInterval);
			}
		}	
		return output_arr.toArray(new int[output_arr.size()][]);	
	}
	public static void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
		}
	}

}
