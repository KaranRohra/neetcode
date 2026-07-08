class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer j = map.get(target - nums[i]);
            if(j != null) {
                return new int[]{j, i};
            }
            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
