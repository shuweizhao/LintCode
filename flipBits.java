class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        if (a == b) {
            return 0;
        }
        int cnt = 0;
        if ((a >= 0 && b < 0) || (a < 0 && b >= 0)) {
            cnt++;
        }
        if (a < 0) {
            a = Integer.MAX_VALUE + a + 1;
        }
        if (b < 0) {
            b = Integer.MAX_VALUE + b + 1;
        }
        
        int temp = 0;
        ArrayList<Integer> binaryA = new ArrayList<Integer>();
        ArrayList<Integer> binaryB = new ArrayList<Integer>();
        while(a >= 1) {
            temp = a % 2;
            binaryA.add(temp);
            a = a / 2;
        }
        while(b >= 1) {
            temp = b % 2;
            binaryB.add(temp);
            b = b / 2;
        }
        int bitA = 0;
        int bitB = 0;
        for(bitA = 0, bitB = 0;bitA < binaryA.size() && bitB < binaryB.size(); bitA++, bitB++) {
            if (binaryA.get(bitA) != binaryB.get(bitB)) {
                cnt++;
            }
        }
        while(bitA < binaryA.size()) {
            if (binaryA.get(bitA) == 1){
                cnt++;
            }
            bitA++;
        }
        while(bitB < binaryB.size()) {
            if (binaryB.get(bitB) == 1){
                cnt++;
            }
            bitB++;
        }
        return cnt;
    }
};

