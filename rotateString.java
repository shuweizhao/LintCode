public class Solution {
    /*
     * param A: A string
     * param offset: Rotate string with offset.
     * return: Rotated string.
     */
    public char[] rotateString(char[] A, int offset) {
        // wirte your code here
        if(A == null || A.length == 0) {
            return A;
        }
        if(offset == 0) {
            return A;
        }
        reverseString(A, 0, A.length - 1);
        reverseString(A, 0, offset % A.length - 1);
        reverseString(A, offset % A.length, A.length - 1);
        return A;
    }
    private void reverseString(char[] A, int start, int end) {
        if (start == end) {
            return;
        }
        char temp = 0;
        for (int i = start, j = end; i <= j; i++, j--) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return;
    }
};
