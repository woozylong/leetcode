/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * @author 1qa
 *
 */
public class MaxProfit_2 {
	 public static int maxProfit(int[] prices) {
		 if(prices.length == 0) return 0;
	      int ans = 0;
	      for(int i=1; i<prices.length; i++){
	          if(prices[i] > prices[i-1])
	            ans += prices[i]-prices[i-1];
	      }
	      return ans;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{1,2,5,8}));
	}
}
