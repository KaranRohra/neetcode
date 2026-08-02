class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return climb(n);
    }

    int climb(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = climb(n - 1) + climb(n - 2);
    }
}
