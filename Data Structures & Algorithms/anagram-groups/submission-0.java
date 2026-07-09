class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<Integer> completedIndex = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            if (completedIndex.contains(i))
                continue;

            List<String> anas = new ArrayList<>();
            anas.add(strs[i]);
            for (int j = i + 1; j < n; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    anas.add(strs[j]);
                    completedIndex.add(j);
                }
            }
            res.add(anas);
        }

        return res;
    }

    boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;

        int[] count = new int[128];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }

        for (int c : count) {
            if (c != 0)
                return false;
        }

        return true;
    }
}
