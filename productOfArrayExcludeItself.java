public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        if (A == null || A.size() == 0) {
            return null;
        }
        ArrayList<Long> result = new ArrayList<Long>(); 
        long product = 1;
        for (int i = 0; i < A.size(); i++) {
            product = 1;
            for (int j = 0; j < A.size(); j++) {
                if (j == i) {
                    continue;
                }
                product *= A.get(j);
            }
            result.add(product);
        }
        return result;
    }
}

