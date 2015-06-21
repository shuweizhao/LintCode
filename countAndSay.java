public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        // Write your code here
        if(n <= 0) {
            return null;
        }
        int cnt = 1;
        String res = "1";
        while (cnt < n) {
            res = SequenceHelper(res);
            cnt++;
        }
        return res;
    }
    private String SequenceHelper(String s) {
        String t = "";
        int cnt = 1;
        if (s.length() > 1) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    cnt++;
                }
                else {
                    t = t + cnt + s.charAt(i);
                    cnt = 1;
                }
            }
        }
        else {
            return "11";
        }
        t = t + cnt + s.charAt(s.length() - 1);
        return t;
    }
}
