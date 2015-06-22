public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        if (digits == null || digits.length == 0) {
            return digits;
        }
        int len = 0;
        int[] result;
        if (isAllNine(digits)) {
            result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = 0;
            }
            return result;
        }
        result = new int[digits.length];
        int carrier = 0;
        result[result.length - 1] = digits[result.length - 1] + 1;
        if (result[result.length - 1] >= 10) {
            result[result.length - 1] -= 10;
            carrier = 1;
        }
        else {
            carrier = 0;
        }
        for (int i = result.length - 2; i >= 0; i--) {
            result[i] = digits[i] + carrier;
            if (result[i] >= 10) {
                result[i] -= 10;
                carrier = 1;
            }
            else {
                carrier = 0;
            }
        }
        return result;
    }
    private boolean isAllNine(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                return false;
            }
        }
        return true;
    }
}
