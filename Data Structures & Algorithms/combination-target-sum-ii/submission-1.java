class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, new ArrayList<>());
        return res;
    }

    void combinationSum(int[] can, int tar, int i, List<Integer> lst) {
        if(tar == 0) {
            res.add(new ArrayList<>(lst));
            return;
        }
        if(i >= can.length || tar < 0 || tar - can[i] < 0) {
            return;
        }
        lst.add(can[i]);
        combinationSum(can, tar - can[i], i + 1, lst);
        lst.remove(lst.size() - 1);
        int val = can[i];
        while(i < can.length && can[i] == val) {
            i++;
        }
        combinationSum(can, tar, i, lst);
    }
}
