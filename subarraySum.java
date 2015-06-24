public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return null;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (map.containsKey(sum)) {
                result.add(map.get(sum));
                result.add(i - 1);
                break;
            }
            map.put(sum, i);
            sum += nums[i];
        }
        
        return result;
    }
}
