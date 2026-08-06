class Solution {
    int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }
        dp = new int[n];
        int max = rob(nums, 0, n - 1);
        dp = new int[n];
        return Math.max(max, rob(nums, 1, n));
    }

    int rob(int[] nums, int i, int n) {
        if (i >= n) {
            return 0;
        }
        if (dp[i] != 0) {
            return dp[i];
        }

        return dp[i] = Math.max(rob(nums, i + 2, n) + nums[i], rob(nums, i + 1, n));
    }
}
