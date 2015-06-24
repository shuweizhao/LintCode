public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        //f[i][j] represents the minimum steps from (0,0) to (i,j)
        int[][] f = new int[row][col];
        //initialize
        f[0][0] = grid[0][0];
        int sum = f[0][0];
        for (int i = 1; i < row; i++) {
            sum += grid[i][0];
            f[i][0] = sum;
        }
        sum = f[0][0];
        for (int j = 1; j < col; j++) {
            sum += grid[0][j];
            f[0][j] = sum;
        }
        //recursion to solve
        for (int i = 1; i < row; i++) {
            for (int j = 1;  j < col; j++) {
                f[i][j] = Math.min(f[i - 1][j], f[i][j - 1]) + grid[i][j];
            }
        }
        //return answer;
        return f[row - 1][col - 1];
    }
}

