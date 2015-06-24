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
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if (head == null) {
            return null;
        }
        
        ListNode DummyNode1 = new ListNode(0);
        ListNode DummyNode2 = new ListNode(0);
        ListNode temp1 = DummyNode1;
        ListNode temp2 = DummyNode2;
        
        ListNode node = head;
        while (node != null) {
            if (node.val < x) {
                ListNode small = new ListNode(node.val);
                temp1.next = small;
                temp1 = small;
            }
            else {
                ListNode great = new ListNode(node.val);
                temp2.next = great;
                temp2 = great;
            }
            node = node.next;
        }
        temp1.next = DummyNode2.next;
        temp2.next = null;
        return DummyNode1.next;
    }
}

