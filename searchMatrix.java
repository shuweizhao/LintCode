public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = 0;
        int col = 0;
        //find which row
        int start = 0;
        int end = matrix.length - 1;
        int mid = 0;
        while(start + 1 < end) {
            mid = start + (end - start) / 2;
            if (matrix[mid][0] == target) {
                return true;
            }
            else if (matrix[mid][0] < target) {
                start = mid;
            }
            else if (matrix[mid][0] > target) {
                end = mid;
            }
        }
        if (matrix[end][0] <= target) {
            row = end;
        }
        else {
            row = start;
        }
        //find which colomn 
        start = 0;
        end = matrix[0].length - 1;
        mid = 0;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (matrix[row][mid] == target) {
                return true;
            }
            else if (matrix[row][mid] < target) {
                start = mid;
            }
            else if (matrix[row][mid] > target) {
                end = mid;
            }
        }
        if (matrix[row][start] == target) {
            return true;
        }
        if (matrix[row][end] == target) {
            return true;
        }
        return false;
    }
}

