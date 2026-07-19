class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        int i = 0, j = 0, max = 0, n = s.length();
        while(j < n) {
            int chr = s.charAt(j);
            if(map[chr] == 0) {
                map[chr]++;
                j++;
            } else {
                map[s.charAt(i)]--;
                i++;
            }
            max = Math.max(max, j - i);
        }

        return max;
    }
}
