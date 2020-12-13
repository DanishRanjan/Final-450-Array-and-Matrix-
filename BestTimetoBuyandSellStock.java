import java.util.Scanner;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxProfit(arr));

	}

	public static int maxProfit(int[] prices) {
		int minimum = Integer.MAX_VALUE;
		int maxprofit = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minimum) {
				minimum = prices[i];
			}
			else {
				if(prices[i]-minimum > maxprofit) {
					maxprofit = prices[i]-minimum;
				}
					
			}
		}
		return maxprofit;
	}

}
