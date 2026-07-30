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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        int len = length(head), i = 0;
        ListNode head1 = head, head2 = head;
        while (i < len / 2 - 1) {
            head2 = head2.next;
            i++;
        }

        if(len % 2 != 0) {
            head2 = head2.next;
        }

        ListNode temp = head2.next;
        head2.next = null;
        ListNode head3 = reverse(temp);
        temp.next = null;

        i = 0;
        while(head1 != null && head3 != null) {
            if(i % 2 == 0) {
                temp = head1.next;
                head1.next = head3;
                head1 = temp;
            } else {
                temp = head3.next;
                head3.next = head1;
                head3 = temp;
            }
            i++;
        }
    }

    public int length(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = reverse(head.next);
        head.next.next = head;
        return tail;
    }
}
