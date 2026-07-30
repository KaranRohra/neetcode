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
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tail = reorder(head, slow);
        tail.next = null;
    }

    ListNode reorder(ListNode head, ListNode tail) {
        if(tail == null) {
            return head;
        }
        head = reorder(head, tail.next);
        tail.next = head.next;
        head.next = tail;
        return tail.next;
    }

    void print(ListNode head) {
        while(head != null) {
            System.out.print(head + " ");
            head = head.next;
        }
        System.out.println("");
    }
}
