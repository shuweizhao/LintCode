public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        else if (A.length == 1) {
            return 1;
        }
        //left represents the length of increasing sequence ending with index i
		//right represents the length of increasing sequence counting from the end of array
        int[] left = new int[A.length];
        int[] right = new int[A.length];
		//initiate
        left[0] = 1;
        right[A.length - 1] = 1;
		//update left array
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
            else {
                left[i] = 1;
            }
        }
		//update right array
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
            else {
                right[i] = 1;
            }
        }
		//return max(left[i], right[i]);
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            maxLen = Math.max(maxLen, left[i]);
            maxLen = Math.max(maxLen, right[i]);
        }
        return maxLen;
    }
}
