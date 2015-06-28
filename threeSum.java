public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (numbers == null) {
            return null;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] == 0 - numbers[j] - numbers[k]) {
                        temp.add(numbers[i]);
                        temp.add(numbers[j]);
                        temp.add(numbers[k]);
                        Collections.sort(temp);
                        if(!result.contains(temp)) {
                            result.add(temp);
                        }
                        break;
                    }
                }
            }
        }
        return result;
    }
}
