/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.
 * @author 1qa
 *
 */
public class MaxProfit {
	 public static int maxProfit(int[] prices) {
		if(prices.length == 0 ) return 0;
        int min = prices[0];
        int rs = 0;
        for(int i = 0; i < prices.length;i++){
        	if(prices[i] < min){
        		min = prices[i];
        	}
        	if(prices[i] - min > rs){
        		rs = prices[i] - min;
        	}
        }
        return rs;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{2,1,3}));
	}
}
