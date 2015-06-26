public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if (nums.size() == 1) {
            return nums.get(0);
        }
        //Collections.sort(nums);
        int size = nums.size();
        int cnt = 0;
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (cnt == 0) {
                result = nums.get(i);
                cnt++;
            }
            else if (nums.get(i) == result) {
                cnt++;
            }
            else {
                cnt--;
            }
        }
        return result;
    }
}

