class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        return rob(nums, 0);
    }

    int rob(int[] nums, int i) {
        if(i >= nums.length) {
            return 0;
        }
        if(dp[i] != 0) {
            return dp[i];
        }
        return dp[i] = Math.max(
            rob(nums, i + 2) + nums[i],
            rob(nums, i + 1)
        );
    }
}
