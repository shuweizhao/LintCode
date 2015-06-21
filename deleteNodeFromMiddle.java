/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        if (node == null || node.next == null) {
            return;
        }
        int temp = 0;
        ListNode prev = node;
		//continuously move the val of node to be deleted back
        while(node.next != null) { 
            prev = node;
            temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;
            node = node.next;
        }
        prev.next = null;
        return;
    }
}
