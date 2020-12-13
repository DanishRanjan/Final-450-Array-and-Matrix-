import java.util.*;
public class TripletSum {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int tc = sc.nextInt();
	while(tc-->0){
	    int n = sc.nextInt();
	    int sum = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int ans = 0;
	    for(int i=0;i<n-2;i++){
	        int left = i+1;
	        int right = n-1;
	        while(left<right){
	            if(arr[i]+arr[left]+arr[right]==sum)
	            {ans = 1;
	            break;}
	            else if(arr[i]+arr[left]+arr[right]<sum){
	                left++;
	            }
	            else{
	                right--;
	            }
	        }
	        if(ans==1){
	            break;
	        }
	    }
	    System.out.print(ans);
	    
	}
}
}
