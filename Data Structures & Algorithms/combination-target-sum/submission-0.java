class Solution {
    Set<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new HashSet<>();
        combinationSum(nums, target, 0, new ArrayList<>());
        List<List<Integer>> finalRes = new ArrayList<>();
        for(List<Integer> lst: res) {
            finalRes.add(lst);
        }
        return finalRes;
    }

    void combinationSum(int[] nums, int target, int i, List<Integer> lst) {
        if (target == 0) {
            var newLst = new ArrayList<>(lst);
            Collections.sort(newLst);
            res.add(newLst);
            return;
        }
        if (i >= nums.length || target < 0) {
            return;
        }
        lst.add(nums[i]);
        combinationSum(nums, target - nums[i], i, lst);
        combinationSum(nums, target - nums[i], i + 1, lst);
        lst.remove(lst.size() - 1);
        combinationSum(nums, target, i + 1, lst);
    }
}
