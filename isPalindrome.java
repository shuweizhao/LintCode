public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        if (s == null || s.length() <= 1) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            //if match whatever case
            if (s.charAt(start) == s.charAt(end) || 
            Math.abs((int)s.charAt(start) - (int)s.charAt(end)) == 32) {
                start++;
                end--;
            }
            else if (inRange((int)s.charAt(start))) {
                start++;
            }
            else if (inRange((int)s.charAt(end))) {
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
	//only count int alphanumerical characters
    private boolean inRange(int n) {
        if (n >= 65 && n <= 90) {
            return false;
        }
        else if (n >= 97 && n <= 122) {
            return false;
        }
        else if (n >= 48 && n <= 57) {
            return false;
        }
        return true;
    }
}
