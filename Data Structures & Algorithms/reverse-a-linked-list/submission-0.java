/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode newHead = reverse(head);
        head.next = null;
        return newHead;
    }

    public ListNode reverse(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        return newHead;
    }
}
