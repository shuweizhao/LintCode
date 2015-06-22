public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        // Write your code here
        boolean signed = false;
        if (n < 0) {
            signed = true;
        }
        Stack<Integer> stack = new Stack<Integer>();
        n = Math.abs(n);
        int bitNum = 0;
        while (n >= 1) {
            stack.push(n % 10);
            n = n / 10;
        }
        long factor = 1;
        long result = 0;
        while (!stack.isEmpty()) {
            result += factor * stack.pop();
            factor *= 10;
        }
        if (result > Integer.MAX_VALUE) {
            result = 0;
        }
        if (signed) {
            return -(int)result;
        }
        return (int)result;
    }
}
