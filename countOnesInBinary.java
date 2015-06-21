public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        int cnt = 0;
        int bit = 0;
		//if num < 0, then turn its complemental code into true code
        if (num < 0) {
            num = Integer.MAX_VALUE + num + 1;
        }
        while(num > 0) {
            bit = num % 2;
            num = num / 2;
            if (bit == 1) {
                cnt++;
            }
        }
        return cnt;
    }
};
