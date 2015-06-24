/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;      
 *     }
 * }
 */
public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        if(l1 == null && l2 == null) {
            return null;
        }
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode node1 = l1;
        ListNode node2 = l2;
        int carrier = 0;
        while (node1.next != null && node2.next != null) {
            node1.val = node1.val + node2.val + carrier;
            if (node1.val >= 10) {
                node1.val -= 10;
                carrier = 1;
            }
            else {
                carrier = 0;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        
        node1.val = node1.val + node2.val + carrier;
        if (node1.val >= 10) {
            node1.val = node1.val - 10;
            carrier = 1;
        }
        else {
            carrier = 0;
        }
        if (node1.next == null && node2.next == null && carrier == 1) {
            node1.next = new ListNode(1);
            return l1;
        }
        if(node2.next != null) {
            node1.next = node2.next;
        }
        while(node1.next != null) {
            node1 = node1.next;
            node1.val = node1.val + carrier;
            if (node1.val >= 10) {
                node1.val -= 10;
                carrier = 1;
            }
            else {
                carrier = 0;
            }
        }
        return l1;
    }
}
