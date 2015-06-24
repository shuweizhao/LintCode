public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        // null or reach the end of the tree
        if (root == null) {
            return node;
        }
        if (node.val < root.val) {
            root.left = insertNode(root.left, node);
        }
        else if (node.val > root.val) {
            root.right = insertNode(root.right, node);
        }
        return root;
    }
}