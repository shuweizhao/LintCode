public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        if (nums == null || nums.length <= 1) {
            return;
        }
        int start = 0;
        int end = nums.length - 1;
        int tmp = 0;
        while (start < end) {
            if (nums[start] % 2 == 0 && nums[end] % 2 == 1) {
                tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
            }
            else if (nums[start] % 2 == 1) {
                start++;
            }
            else if (nums[end] % 2 == 0) {
                end--;
            }
        }
        return;
    }
}
