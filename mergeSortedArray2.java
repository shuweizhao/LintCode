class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int A_size = A.size() - 1;
        int B_size = B.size() - 1;
        int index = A.size() + B.size() - 1;
        int i = 0, j = 0;
        while (i <= A_size && j <= B_size) {
            if(A.get(i) <= B.get(j)) {
                result.add(A.get(i));
                i++;
            }
            else {
                result.add(B.get(j));
                j++;
            }
        }
        while (i <= A_size) {
            result.add(A.get(i));
            i++;
        }
        while (j <= B_size) {
            result.add(B.get(j));
            j++;
        }
        return result;
    }
}
