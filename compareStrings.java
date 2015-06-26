public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if ((A == null && B == null) || 
        (A.length() == 0 && B.length() == 0)) {
            return true;
        }
        if (A == null || A.length() == 0) {
            return false;
        }
        if (B == null || B.length() == 0) {
            return true;
        }
        int[] charSet = new int[256];
        for (int i = 0; i < A.length(); i++) {
            int charNum = (int)A.charAt(i);
            charSet[charNum]++;
        }
        for (int i = 0; i < B.length(); i++) {
            if (charSet[(int)B.charAt(i)] == 0) {
                return false;
            }
            else {
                charSet[(int)B.charAt(i)]--;
            }
        }
        return true;
    }
}
