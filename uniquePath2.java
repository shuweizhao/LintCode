public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if(obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        //f[i][j] represents the number of paths from (0,0) to (i,j)
        int[][] f = new int[row][col];
        //initialize
        boolean blocked = false;
        for(int i = 0; i < row; i++) {
            if(obstacleGrid[i][0] == 1 || blocked == true) {
                f[i][0] = 0;
                blocked = true;
            }
            else {
                f[i][0] = 1;
            }
        }
        blocked = false;
        for(int j = 0; j < col; j++) {
            if(obstacleGrid[0][j] == 1 || blocked == true) {
                f[0][j] = 0;
                blocked = true;
            }
            else {
                f[0][j] = 1;
            }
        }
        //recursion to solution
        for(int i = 1; i < row; i++) {
            for(int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    f[i][j] = 0;
                }
                else {
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
            }
        }
        //return 
        return f[row - 1][col - 1];
    }
}
