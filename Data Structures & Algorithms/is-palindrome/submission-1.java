class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && !isValidChar(s.charAt(i))) i++;
            while (j >= 0 && !isValidChar(s.charAt(j))) j--;

            if (i < j && s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    boolean isValidChar(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }
}
