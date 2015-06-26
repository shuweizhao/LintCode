class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        if(n <= 0) {
            return 0;
        }
        if(n / 5 == 0) {
            return 0;
        }
        return n / 5 + trailingZeros(n / 5);
    }
};

