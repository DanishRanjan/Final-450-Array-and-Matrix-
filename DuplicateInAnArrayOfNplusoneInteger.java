import java.util.*;
public class DuplicateInAnArrayOfNplusoneInteger {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(); //ArraySize
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(duplicate(arr));
}

public static int duplicate(int[] nums) {
	int i=0;
	int ans=-1;
	while(i<nums.length) {
		if(nums[i]==i+1) {
			i++;
		}
		else {
			if(nums[i]==nums[nums[i]-1]) {
				ans = nums[i];
				break;
			}
			else {
				int temp = nums[i];
				nums[i] = nums[nums[i]-1];
				nums[temp-1] =temp;
			}
		}
	}
	return ans;
}
}
