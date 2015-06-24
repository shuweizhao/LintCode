public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
		//version 1 use java sort method without hashmap
		//Time Complexity O(nlogn) Space Complexity O(1)
        if (str == null || str.length() == 0) {
            return true;
        }
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        for (int i = 1; i < str.length(); i++) {
            if (temp[i] == temp[i - 1]){
                return false;
            }
        }
		//use hashMap as extra memory
		//Time Complexity O(n) Space Complexity O(n) maximum;
        /*
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey((int)str.charAt(i))) {
                map.put((int)str.charAt(i), 1);
            }
            else {
                return false;
            }
        }*/
        return true;
    }
}
