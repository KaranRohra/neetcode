class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        return Math.min(climb(cost, 0), climb(cost, 1));
    }

    int climb(int[] cost, int i) {
        if (i >= cost.length) {
            return 0;
        }
        if(dp[i] != 0) {
            return dp[i];
        }
        return dp[i] = Math.min(climb(cost, i + 1), climb(cost, i + 2)) + cost[i];
    }
}
