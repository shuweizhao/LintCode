class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        int existance = 0;
        if (source == null || target == null) {
            return -1;
        }
        if (target.length() == 0) return 0;
		int start = source.indexOf(target.charAt(0));
      	for (int j = 1; j < target.length(); j++) {
      		if (source.charAt(start + j) == target.charAt(j)) {
      		    existance = 1;
      		}
      		else { 
      			existance = -1;
      			break;
      		}
        }
      	if(existance == 1) {
      	  return start;
      	}
      	else {
      	  return -1;
      	}
    }

}
