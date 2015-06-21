public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        // Write your code here
        if (s == null || s.length() == 0) {
            return 0;
        }
        ArrayList<Integer> space = new ArrayList<Integer>();
		//use space to cut the words out
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                space.add(i);
            }
        }
		//if no spaces found, then return original length
        if(space.size() == 0) {
            return s.length();
        }
        else {
			//if  the last found space index in at the end of original string return the previous one
            if (space.get(space.size() - 1) == s.length() - 1) {
                return space.get(space.size() - 1)  - 1 - space.get(space.size() - 2);
            }
            return s.length() - 1 - space.get(space.size() - 1);
        }
    }
}