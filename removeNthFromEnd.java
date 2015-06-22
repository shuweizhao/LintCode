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
     * @return: The head of linked list.
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n <= 0) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int size = size(head);
        if(n > size) {
            return head;
        }
        size++;
        ListNode node = dummy;
        while(node.next != null && node.next.next != null) {
            if(size == n + 1) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
            size--;
        }
        if(n == 1) {
            node.next = null;
        }
        return dummy.next;
    }
    private int size(ListNode head) {
        int size = 0;
        while(head.next != null) {
            size++;
            head = head.next;
        }
        size++;
        return size;
    }
}

