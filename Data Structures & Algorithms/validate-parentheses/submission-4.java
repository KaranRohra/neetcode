class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] stack = s.toCharArray();
        int top = -1;
        for (char c : stack) {
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
