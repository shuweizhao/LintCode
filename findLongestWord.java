class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        if (dictionary  == null || dictionary.length == 0) {
            return null;
        }
        ArrayList<String> result = new ArrayList<String>();
        int size = dictionary.length;
        int maxLength = 0;
		//version 1 find maxlength then find longest word.  2 loops in total O(N) time O(1) space
        /*for (int i = 0; i < size; i++) {
            if (dictionary[i].length() > maxLength) {
                maxLength = dictionary[i].length();
            }
        }
        for (int i = 0; i < size; i++) {
            if (dictionary[i].length() == maxLength) {
                result.add(dictionary[i]);
            }
        }*/
		//version 2 one loop continuously update the result. 1 loop O(N) time and O(1) spsace
        result.add(dictionary[0]);
        for (int i = 1; i < size; i++) {
            if (dictionary[i].length() > result.get(0).length()) {
                result.clear();
                result.add(dictionary[i]);
            }
            else if (dictionary[i].length() == result.get(0).length()) {
                result.add(dictionary[i]);
            }
        }
        return result;
    }
};
