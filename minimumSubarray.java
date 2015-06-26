public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        int minValue = Integer.MAX_VALUE;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum1 += nums.get(i);
            sum2 = 0;
            minValue = Math.min(minValue, sum1 - sum2);
            for (int j = 0; j < i; j++) {
                sum2 += nums.get(j);
                minValue = Math.min(minValue, sum1 - sum2);
            }
        }
        return minValue;
    }
}

