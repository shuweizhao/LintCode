public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int size = 0;
        int dupTimes = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[size]) {
                nums[++size] = nums[i];
                dupTimes = 0;
            }
            else {
                if(dupTimes == 0){
                nums[++size] = nums[i];
                dupTimes = 1;
                }
            }
        }
        return size + 1;
    }
}
