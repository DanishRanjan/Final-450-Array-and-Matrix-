import java.util.*;
public class MajorityElement_n_by_2 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(majorityElement(arr));
}
public static int majorityElement(int[] nums)
{
    int count=0;
    int candidate = 0;
    for(int num: nums) {
    	if(count==0) {
    		candidate = num;
    	}
    	if(num==candidate) {
    		count++;
    	}
    	else {
    		count = count-1;
    	}
    }
    return candidate;
}

}
