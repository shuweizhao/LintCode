public class Solution {
    /**
     * @param s: A string
     * @return: A list of lists of string
     */
    public List<List<String>> partition(String s) {
        // write your code here
        List<List<String>> result = new ArrayList<List<String>>();
        if(s == null || s.length() == 0) {
            return result;
        }
        List<String> list = new ArrayList<String>();
        result = helper(result, list, s, 0);
        return result;
    }
    
    private boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        for (int start = 0, end = s.length() - 1; start < end; start++, end--){
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
        }
        return true;
    }
    private List<List<String>> helper(List<List<String>> result, 
    List<String> list, String s, int position) {
        if (position == s.length()) {
            result.add(new ArrayList<String>(list));
            return result;
        }
        String substr = "";
        for (int i = position; i < s.length(); i++) {
            substr += s.charAt(i);
            if (!isPalindrome(substr)) {
                continue;
            }
            list.add(substr);
            helper (result, list, s, i + 1);
            list.remove(list.size() - 1);
        }
        return result;
    }
}
