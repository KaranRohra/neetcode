class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int num : nums) {
            int conNum = num;
            int len = 1;
            while (map.getOrDefault(conNum + 1, 0) != 0) {
                map.put(conNum, map.get(conNum) - 1);
                conNum++;
                len++;
            }
            conNum = num;
            while (map.getOrDefault(conNum - 1, 0) != 0) {
                map.put(conNum, map.get(conNum) - 1);
                conNum--;
                len++;
            }

            res = Math.max(res, len);
        }
        return res;
    }
}
