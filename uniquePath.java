public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here
        if (m == 0 || n == 0) {
            return 0;
        }
        //f[i][j] represents the number of paths from(0,0) to (i,j)
        int[][] f = new int[m][n];
        //initialize
        f[0][0] = 1;
        for(int i = 0; i < m; i++) {
            f[i][0] = 1;
        }
        for(int j = 0; j < n; j++) {
            f[0][j] = 1;
        }
        //resursion to solution
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }
}

