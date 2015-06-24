class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if (x < 0) {
            return -1;
        }
        else if (x == 0) {
            return 0;
        }
        else if (x > 0) {
            int start = 1;
            int end = x;
            int mid = 0;
            while (start + 1 < end) {
               mid = start + (end - start) / 2;    
               if (Math.pow(mid, 2) == x) {
                   return mid;
               }
               else if (Math.pow(mid, 2) < x) {
                   start = mid;
               }
               else if (Math.pow(mid, 2) > x) {
                   end = mid;
               }
            }
            if (Math.pow(start, 2) < x){
                return start;
            }
            else {
                return end;
            }
        }
        return Integer.MIN_VALUE;
    }
}
