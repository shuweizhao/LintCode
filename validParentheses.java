public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        if(s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<String> stack = new Stack<String>();
        int len = 0;
        String tmp = "";
        while (len <= s.length() - 1) {
            tmp = "";
            tmp += s.charAt(len);
            if (stack.isEmpty()) {
                stack.push(tmp);
            }
            else {
                if (isPair(stack.peek(), tmp)) {
                    stack.pop();
                }
                else {
                    stack.push(tmp);
                }
            }
            len++;
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
    private boolean isPair(String a, String b) {
        char A = a.charAt(0);
        char B = b.charAt(0);
        if (A == '(' && B == ')') {
            return true;
        }
        else if (A == '[' && B == ']') {
            return true;
        }
        else if (A == '{' && B == '}') {
            return true;
        }
        return false;
    }
}
