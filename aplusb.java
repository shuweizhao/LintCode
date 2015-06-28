class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        int res = 0;
        int bita = 0;
        int bitb = 0;
        int carrier = 0;
        for (int i = 0; i < 32; i++) {
            bita = (a >> i) & 1;
            bitb = (b >> i) & 1;
            res |= (bita ^ bitb ^ carrier) << i;
            if ((bita == 1 && bitb == 1) || ((bita == 1 || bitb == 1) && carrier == 1)) {
                carrier = 1;
            }
            else {
                carrier = 0;
            }
        }
        return res;
    }
};
