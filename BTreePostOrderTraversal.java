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
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
		//version 1: recursive
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null) {
		   return result;
		}
        
		ArrayList<Integer> left = postorderTraversal(root.left);
		ArrayList<Integer> right = postorderTraversal(root.right);
        
		result.addAll(left);
		        result.addAll(right);
		        result.add(root.val);
        
		        return result;
				
		//version 2: iterative 
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode prev = null;
        TreeNode curr = root;
        stack.push(root);
        while (!stack.isEmpty()) {
            curr = stack.peek();
            if (prev == null || prev.left == curr || prev.right == curr) { 
                //traverse down the tree
                if (curr.left != null) {
                    stack.push(curr.left);
                } else if (curr.right != null) {
                    stack.push(curr.right);
                }
            }
            else if (curr.left == prev) {
                //traverse up the tree from left
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            }
            else {
                //traverse up the tree from right
                stack.pop();
                res.add(curr.val);
            }
            prev = curr;
        }
        return res;
    }
}
