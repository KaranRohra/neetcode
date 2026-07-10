class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] res = new int[k];
        List<Map.Entry<Integer, Integer>> mapLst =
            map.entrySet().stream().sorted((e1, e2) -> e2.getValue() - e1.getValue()).toList();
        for (Map.Entry entry : mapLst) {
            if (k == 0)
                break;

            res[--k] = (int) entry.getKey();
        }

        return res;
    }
}
