public class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        if (string == null || length == 0) {
            return 0;
        }
        ArrayList<Integer> spaceIndex = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') {
                spaceIndex.add(i);
            }
        }
        if (spaceIndex.size() == 0) {
            return length;
        }
        int size = spaceIndex.size();
        int end = length - 1;
        int start = spaceIndex.get(size - 1) + 1;
        int distance = 2 * size;
        for (int i = size - 1; i >= 0 ; i--) {
            charMove(string, start, end, distance);
            string[spaceIndex.get(i) + 2 * i] = '%';
            string[spaceIndex.get(i) + 2 * i + 1] = '2';
            string[spaceIndex.get(i) + 2 * i + 2] = '0';
            if (i >= 1 && spaceIndex.get(i - 1) + 1!= spaceIndex.get(i)) {
                end = spaceIndex.get(i) - 1;
                start = spaceIndex.get(i - 1) + 1;
            }
            else {
                end = 1;
                start = 2;
            }
            distance -= 2;
            length += 2;
        }
        return length;
    }
    //move from start~end to start+distance ~ end+distance
    private void charMove(char[] string, int start , int end, int distance) {
        for (int i = end; i >= start; i--) {
            string[i + distance] = string[i];
        }
    }
}
