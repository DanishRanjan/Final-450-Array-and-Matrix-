import java.util.*;

public class majorityELement_n_by_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(majorityElement(arr));
		
	}

	public static List<Integer> majorityElement(int[] nums) {
		int number1 = -1;
		int number2 = -1;
		int count1 = 0;
		int count2 = 0;
		int len = nums.length;
		for(int i=0;i<len;i++) {
			if(nums[i] == number1) {
				count1++;
			}
			else if(nums[i] == number2) {
				count2++;
			}
			else if(count1 == 0) {
				number1 = nums[i];
				count1 = 1;
			}
			else if(count2 == 0) {
				number2 = nums[i];
				count2 = 1;
			}
			else {
				count1--;
				count2--;
			}
		}
		List<Integer> ans = new ArrayList<>();
		count1 = 0;
		count2 = 0;
		for(int i=0;i<len;i++) {
			if(nums[i] == number1) {
				count1++;
			}
			else if( nums[i] == number2) {
				count2++;
			}
		}
		if(count1 > len/3) {
			ans.add(number1);
		}
		if(count2 > len/3) {
			ans.add(number2);
		}
		return ans;
	}

}

//8
//1 1 1 2 2 3 3 3
