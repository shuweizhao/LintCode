public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: The recovered sorted array
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        int pos;
        pos = findMax(nums);
        reverse(nums, 0, pos);
        reverse(nums, pos + 1, nums.size() - 1);
        reverse(nums, 0, nums.size() - 1);
        return;
    }
     private int findMax(ArrayList<Integer> arr) {
        int max = -1;
        for(int i = 0; i < arr.size() - 1; i++)  {
        	if(arr.get(i) <= arr.get(i + 1)) {
        		continue;
        	}
        	else {
        		max = i;
        		break;
        	}
        }
        if(max == -1) max = arr.size() - 1;
        return max;
    }

    private void reverse(ArrayList<Integer> nums, int start, int end)  {
        int temp;
        //ArrayList<Integer> result = new ArrayList<Integer>(arr);
        while(start + 1 <= end) { 
          temp = nums.get(start);
          nums.set(start, nums.get(end));    
          nums.set(end, temp);
          start++;
          end--;
        }
        return;
    }

}
