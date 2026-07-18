class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, profit = 0;
        int max = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            profit = Math.max(profit, max - prices[i]);
            max = Math.max(max, prices[i]);
        }
        return profit;
    }
}
