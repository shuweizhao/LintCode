public class Solution {
    /**
     * @param matrix: a matrix of integers
     * @return: an array of integers
     */ 
    public int[] printZMatrix(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length <= 0) {
            return null;
        }
        if (matrix.length == 1) {
            return matrix[0];
        }
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int[] result = new int[colLen * rowLen];
        int sum = 0;
        int row = 0;
        int col = 0;
        int index = 0;
        while (sum < rowLen + colLen - 1) {
            if (sum % 2 ==0) {
                while(row >= 0 && col < colLen) {
                    result[index] = matrix[row][col];
                    index++;
                    row--;
                    col = sum - row;
                }
                row++;
                col--;
                sum++;
                if (col + 1 <= colLen - 1) {
                    col++;
                }
                else {
                    row++;
                }
            }
            else {
                while(col >= 0 & row < rowLen) {
                    result[index] = matrix[row][col];
                    index++;
                    col--;
                    row = sum - col;
                }
                col++;
                row--;
                sum++;
                if (row + 1 <= rowLen - 1) {
                    row++;
                }
                else {
                    col++;
                }
            }
        }
        return result;
    }
}
