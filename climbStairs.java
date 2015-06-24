public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if (n <= 0) {
            return 0;
        }
        //f[i] represents the number of ways to get to the top of the stairs
        int[] f = new int[n + 1];
        //initialize
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }
        return f[n];
    }
}
