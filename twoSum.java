import java.util.*;
public class twoSum {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int target = sc.nextInt();
	
	int[] ans = twosum(arr, target);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
}
public static int[] twosum(int[] nums, int target) {
	Map<Integer, Integer> num_map = new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		int complement = target-nums[i];
		
		if(num_map.containsKey(complement)) {
			return new int[] {num_map.get(complement),i};
		}
		num_map.put(nums[i], i);
	}
	throw new IllegalArgumentException("no match Found!");
}
}
//---------------------------------------------------------------------------------------------------------------------------