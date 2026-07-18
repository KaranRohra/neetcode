class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, profit = 0;
        int[] rightMax = new int[n];
        rightMax[n-1] = prices[n-1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], prices[i]);
        }
        for (int i = 0; i < n; i++) {
            profit = Math.max(profit, rightMax[i] - prices[i]);
        }
        return profit;
    }
}
