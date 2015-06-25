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
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
	//recursive
	ArrayList<Integer> result = new ArrayList<Integer>();
	        if (root == null) {
	            return result;
	        }
	        ArrayList<Integer> left = inorderTraversal(root.left);
	        ArrayList<Integer> right = inorderTraversal(root.right);
        
	        result.addAll(left);
	        result.add(root.val);
	        result.addAll(right);
        
	        return result;
	//iterative
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;    
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.peek();
            stack.pop();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }
}
