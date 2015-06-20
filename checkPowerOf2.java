class Solution {
    /*
     * @param n: An integer
     * @return: True or false
     */
	
	// Version 1
    public boolean checkPowerOf2(int n) {
        // write your code here
        if (n <= 0) {
            return false;
        }
        if ((n & n - 1) == 0) {
            return true;
        } 
        return false;
    }
	// Version 2
	/*public boolean checkPowerOf2(int n) {
        // write your code here
        if (n <= 0) {
            return false;
        }
        if ((n & -n) == n) {
            return true;
        } 
        return false;
    }*/	
};