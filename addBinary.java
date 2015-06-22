public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        // Write your code here
        if(a.length() == 0 && b.length() == 0) {
            return null;
        }
        else if (a.length() == 0) {
            return b;
        }
        else if (b.length() == 0) {
            return a;
        }
        String result = "";
        String tmp = "";
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carrier = 0;
        int bit = 0;
        while (aLen >= 0 && bLen >= 0) {
            bit = ((int)a.charAt(aLen) - 48) + ((int)b.charAt(bLen) - 48) + carrier;
            if (bit >= 2) {
                bit -= 2;
                carrier = 1;
            }
            else {
                carrier = 0;
            }
            result = bit + result;
            aLen--;
            bLen--;
        }
        while(aLen >= 0) {
            bit = (int)a.charAt(aLen) - 48 + carrier;
            if (bit >= 2) {
                bit -= 2;
                carrier = 1;
            }
            else {
                carrier = 0;
            }
            result = bit + result;
            aLen--;
        }
        while(bLen >= 0) {
            bit = (int)b.charAt(bLen) - 48 + carrier;
            if (bit >= 2) {
                bit -= 2;
                carrier = 1;
            }
            else {
                carrier = 0;
            }
            result = bit + result;
            bLen--;
        }
        if (carrier == 1) {
            result = 1 + result;
        }
        return result;
    }
}
