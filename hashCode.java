class Solution {
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        if (key == null || key.length == 0) {
            return 0;
        }
        long sum = 0;
        for (int i = 0; i < key.length; i++) {
            sum = sum * 33 + (int)key[i];
            sum = sum % HASH_SIZE;
        }
        return (int)sum;
    }
};
