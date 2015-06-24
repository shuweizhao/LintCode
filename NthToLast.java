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
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        // write your code here
        ListNode result = new ListNode(0);
        if (head == null) {
            return null;
        }
        int size = 0;
        ListNode node = head;
        while (node.next != null) {
            size++;
            node = node.next;
        }
        size++;
        if (size == 1) {
            return head;
        }
        ListNode node1 = head;
        while (size > 0) {
            
            if (size == n) {
                result = node1;
            }
            node1 = node1.next;
            size--;
        }
        return result;
    }
}

