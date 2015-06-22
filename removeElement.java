public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        int elemLength = 0;
        int end = 0;
        if (A[A.length - 1] == elem) {
            end = A.length - 1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == elem) {
                elemLength++;
            }
            if (i != 0 && A[i - 1] == elem && A[i] != elem) {
                end = i;
            }
        }
        //int start = end - elemLength;
        if (A[A.length - 1] != elem) {
            for (int i = end; i < A.length; i++) {
                A[i - elemLength] = A[i];    
            }
        }
        int targetLength = A.length - elemLength;
        return targetLength;
    }
}

