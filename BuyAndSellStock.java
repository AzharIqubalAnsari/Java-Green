/*  Leetcode 122 Buy and Sell Stock 2
    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
Example 3:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 

Constraints:

1 <= prices.length <= 3 * 104
0 <= prices[i] <= 104

 */


class BuyAndSellStock {


        static int rec(int i, int buyStatus, int prices[], int dp[][]){
            
            if(i == prices.length){
                return 0;
            }
    
            if(dp[i][buyStatus] != -1){
                return dp[i][buyStatus];
            }
    
            int ans = 0;
    
            // buy or skip
            if(buyStatus == 0){
                int skip = rec(i+1, 0, prices, dp);
                int buy = -prices[i] + rec(i+1, 1, prices, dp);
    
                ans = Math.max(skip, buy);
            }
            else{// buyStatus == 1
    
            // Sell or Skip
                int skip = rec(i+1, 1, prices, dp);
                int sell = prices[i] + rec(i+1, 0, prices, dp);
    
                ans = Math.max(skip, sell);
            }
    
            dp[i][buyStatus] = ans;
    
            return ans;
        }
    
        public int maxProfit(int[] prices) {
            int n = prices.length;
    
            int dp[][] = new int[n][2];
    
            for(int i = 0; i < n; i++){
                for(int j = 0; j < 2; j++){
                    dp[i][j] = -1;
                }
            }
    
            return rec(0, 0, prices, dp);
        }
    
    public static void main(String[] args) {
        
        int prices[] = {7,1,5,3,6,4};

        BuyAndSellStock obj = new BuyAndSellStock();
        System.out.println("Maximum profit " + obj.maxProfit(prices));
    }
}

