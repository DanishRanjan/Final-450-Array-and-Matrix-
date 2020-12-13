import java.util.Scanner;

public class MinimumSwapAndKTogether {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			int good=0;
			for(int i=0;i<n;i++) {
				if(arr[i]<=k)
					{
					good++;              //Total number of element in whole array which are smaller than k
					}
			}
			int bad=0;
			for(int i=0;i<good;i++) {
				if(arr[i]>k) {                //Total number of element in first window which are greater than k
					bad++;
				}
			}
			int min = Integer.MAX_VALUE;
			int i=0;
			int j = good-1;
			if(good==0) {
				System.out.println(0);
				continue;
			}
			while(j<n) {
				min = Math.min(bad, min);
				j++;
				if(j<n && arr[j]>k )
				{                                 //if the next element of window is greater than k, then add the value of bad by 1;
					bad++;
				}
				if(arr[i]>k)
				{                                //if the previous element of window is greater than k, the decrease the value of bad by 1,	                     
					bad--;                       //cuz, it is extra for now
				}
				i++;
			}
			
			if(min == Integer.MAX_VALUE) {
				System.out.println("0");
			}
			else {
				System.out.println(min);
			}
		}
	}

}
