public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
        if (nums.size() == 1) {
            return nums.get(0);
        }
        int sum1 = 0;
        int sum2 = 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            sum1 += nums.get(i);
            sum2 = 0;
            result = Math.max(result, sum1 - sum2);
            for (int j = 0; j < i; j++) {
                sum2 += nums.get(j);
                result = Math.max(result, sum1 - sum2);
            }
        }
        return result;
    }
}
