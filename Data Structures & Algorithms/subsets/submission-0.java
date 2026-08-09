class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        subsets(nums, 0, new ArrayList<>());
        return res;
    }
    void subsets(int[] nums, int i, List<Integer> lst) {
        if(i >= nums.length) {
            res.add(new ArrayList<>(lst));
            return;
        }
        subsets(nums, i + 1, lst);
        lst.add(nums[i]);
        subsets(nums, i + 1, lst);
        lst.remove(lst.size() - 1);
    }
}
