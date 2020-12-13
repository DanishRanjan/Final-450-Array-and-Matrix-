import java.util.*;
public class MaximumProfitbyBuyingandSellingaStockatMostTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxProfit(arr));
	}
	//simplest approach o(N) and o(1)
//	Let us take price[] = { 3, 5, 4, 5} 
//	We buy 1st stock on day 1 
//	buy1 = 3.
//	We sell 1st stock on day 2. 
//	profit1 = 5 – 3 = 2.
//	We will make a profit of 2 after buying the stock on 1st day and selling on 2nd day. 
//	So, profit1 = 2
//	Now we will buy the 2nd stock on 3rd day
//	Stock price on 3rd day is 4 
//	Since we already made a profit of 2, We will spend only 2 extra from our packet to buy the stock 
//	i.e., (4 – profit1) = 2
//	buy2 = 2
//	Now, we sell 2nd stock on day 4.
//	Stock price on 4th day is 5. 
//	profit2 = 5 – buy2 = 5 – 2 = 3.
//	Now, we can see that the final profit includes the profit of buying and selling two stocks 
	
//	public static int maxProfit(int price[]) {
//		int buy1, buy2, profit1, profit2;
//		buy1 = buy2 = Integer.MAX_VALUE;
//		profit1 = profit2 = 0;
//		for(int i=0; i<price.length;i++) {
//			buy1 = Math.min(buy1,price[i]);
//			profit1 = Math.max(profit1, price[i]-buy1);
//			buy2 = Math.min(buy2, price[i]-profit1);
//			profit2 = Math.max(profit2, price[i]-buy2);
//		}
//		return profit2;
//	}
  //-------------------------------------------------------------------2nd Approach-----------------------------------------------------------------------------------------
	
	 //valley-peak approach
	   /* 
	    * 
	    * 
	    * There is one more approach for calculating this problem using Valley-Peak approach i.e. take a variable profit and initialize it with zero and 
	    * then traverse through the array of price[] from (i+1)th position whenever initial position value is greater than 
	    * the previous value add it to variable profit.
	                      80
	                      /
	       30            /
	      /  \          25
	     /    15       /
	    /      \      /
	   2        10   /
	              \ /
	               8
	    */ 
//	public static int maxProfit(int price[]) {
//		int n = price.length;
//		int diff =0;
//		for(int i=1;i<n;i++) {
//			if(price[i]>price[i-1]) {
//				diff = diff+price[i]-price[i-1];
//			}
//		}
//		return diff;
//	}
	
//-------------------------------------------------------Dynamic Programming -----------------------------------------------------------------------------	

	public static int maxProfit(int price[]) {
		int n = price.length;
		int[] dp = new int[n];
		for(int i=0;i<n;i++) {
		dp[i] = 0;
		}
		int lastTraversal = price[n-1];
		int frontTraversal = price[0];
		for(int i=n-2;i>=0;i--) {
			if(price[i]>lastTraversal)
				{lastTraversal = price[i];}
			dp[i] = Math.max(dp[i+1],lastTraversal-price[i]);
		}
		for(int i=1;i<n;i++) {
			if(price[i]<frontTraversal)
				{frontTraversal = price[i];}
			dp[i] = Math.max(dp[i-1],dp[i]+(price[i]-frontTraversal));
		}
		return dp[n-1];
	}
	
	   
}

//7
//2 30 15 10 8 25 80
