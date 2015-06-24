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
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode dummyNode = new ListNode(0);
        ListNode target = dummyNode;
        ListNode point1 = l1;
        ListNode point2 = l2;
        while (point1 != null && point2 != null) {
            if (point1.val < point2.val) {
                target.next = new ListNode(point1.val);
                point1 = point1.next;
                target = target.next;
            }
            else {
                target.next = new ListNode(point2.val);
                point2 = point2.next;
                target = target.next;
            }
        }
        if (point1 != null) {
            target.next = point1;
        }
        if (point2 != null) {
            target.next = point2;
        }
        return dummyNode.next;
    }
}
