public class Solution {
    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {
        // write your code
        String result = "";
        if(s == null || s.length() == 0) {
            return s;
        }
        ArrayList<Integer> spaceIndex = new ArrayList<Integer>();
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceIndex.add(i);
            }
        }
        int size = spaceIndex.size();
        if (size == 0) {
            return s;
        }
        size--;
        int start = spaceIndex.get(size) + 1;
        int end = s.length();
        while (size >= 0) {
            result += s.substring(start, end);
            result += ' ';
            end = start - 1;
            size--;
            if (size >= 0) {
            	start = spaceIndex.get(size) + 1; 
            }
            else {
            	break;
            }
        }
        result += s.substring(0, spaceIndex.get(++size));
        return result;
    }

}

