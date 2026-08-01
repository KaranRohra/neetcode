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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode sumNode = head;
        int extra = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + extra;
            int mod = sum % 10;
            extra = sum / 10;
            sumNode.next = new ListNode(mod);
            l1 = l1.next;
            l2 = l2.next;
            sumNode = sumNode.next;
        }
        ListNode node = l1 == null ? l2 : l1;
        while(node != null) {
            int sum = node.val + extra;
            int mod = sum % 10;
            extra = sum / 10;
            sumNode.next = new ListNode(mod);
            node = node.next;
            sumNode = sumNode.next;
        }
        if(extra != 0) {
            sumNode.next = new ListNode(extra);
        }
        return head.next;
    }
}
