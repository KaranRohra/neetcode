class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Set<Set<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int target = -(nums[i] + nums[j]);
                Integer count = map.get(target);
                if(count == null ||
                    (nums[i] == target && count <= 1) ||
                    (nums[j] == target && count <= 1) ||
                    (nums[i] == target && nums[j] == target && count <= 2)
                ) {
                    continue;
                }
                List<Integer> triplet = Arrays.asList(nums[i], nums[j], target);
                Set<Integer> tripletSet = new HashSet<>(triplet);
                if(!set.contains(tripletSet)) {
                    res.add(triplet);
                    set.add(tripletSet);
                }
            }
        }

        return res;
    }
}
