public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0) return 0;
        int start = 0;
        int end = A.length - 1;
        int mid = start + (end - start) / 2;
        while(start + 1 < end) { 
          mid = start + (end - start) / 2;
          if(target > A[mid]) {
              start = mid;
          }
          else if(target < A[mid]) {
              end = mid;
          }
          else { 
              return mid;    
          }
        }
         if(target > A[end]) return end + 1;
        else if(target > A[start]) return start + 1;
        else return start;
    }
}

