class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n <= 1) {
            return 0;
        }
        int n1 = 0;
        int n2 = 1;
        int cnt = 1;
        while (cnt <= n - 1) {
            if (cnt % 2 == 0) {
                n1 = n1 + n2;
            }
            else {
                n2 = n1 + n2;
            }
            cnt++;
        }
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }
}


