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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
		/*//Recursion 
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null) {
		   return result;
		}
		result.add(root.val);
		result.addAll(preorderTraversal(root.left));
		result.addAll(preorderTraversal(root.right));
		return result;
		*/
		//Non-Recursion 
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) {
            return result;
        }
        TreeNode temp;
        stack.push(root);
        while(!stack.empty()) {
            temp = stack.pop();
            result.add(temp.val);
            if(temp.right != null) {
                stack.push(temp.right);
            }
            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
        return result;
    }
}
