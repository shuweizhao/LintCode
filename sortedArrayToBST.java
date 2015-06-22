/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        if (A == null || A.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(A[A.length / 2]);
        root.left = helper(A, 0, A.length / 2 - 1);
        root.right = helper(A, A.length / 2 + 1, A.length - 1);
        return root;
    }  
    private TreeNode helper(int[] A, int start, int end) {
        if (start > end) {
            return null;
        }
        else if (start == end) {
            return new TreeNode(A[start]);
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = helper(A, start, mid - 1);
        root.right = helper(A, mid + 1, end);
        return root;
    }
}

