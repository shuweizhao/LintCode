public class Solution {
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // write your code here
        if(triangle == null || triangle.size() == 0) {
            return 0;
        }
        int n = triangle.size();
        int[][] f = new int[n][n];
        
        //f[i][j] represents the path sum 
        //from (i,j) to the bottom of the triangle
        
        //initialize the last row
        for(int i = 0; i < n; i++) {
            f[n - 1][i] = triangle.get(n-1).get(i);
        }
        
        //Recursion to get answer
        for(int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                f[i][j] = Math.min(f[i+1][j], f[i+1][j+1]) 
                + triangle.get(i).get(j);
            }
        }
        
        //return answer
        return f[0][0];
    }
}