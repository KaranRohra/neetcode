class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] stack = new char[n];
        int top = -1;
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack[++top] = c;
            } else if (top != -1 && ((c == ']' && stack[top] == '[')
                || (c == '}' && stack[top] == '{')
                || (c == ')' && stack[top] == '('))) {
                top--;
            } else {
                return false;
            }
        }

        return top == -1;
    }
}
