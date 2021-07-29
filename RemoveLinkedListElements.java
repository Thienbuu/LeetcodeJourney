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
    //better than 74%
    // public ListNode removeElements(ListNode head, int val) {
    //     ListNode temp = new ListNode(0, head);
    //     ListNode result = temp;
    //     while (temp != null && temp.next != null) {
    //         if (temp.next.val == val) {
    //             temp.next = temp.next.next == null ? null: temp.next.next;
    //         }
    //         else temp = temp.next;
    //     }
    //     return result.next;
    // }
    
    //better than 100%
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode();
        ListNode result = temp;
        while (head != null) {
            if (head.val != val) {
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;
        }
        //incase the last node has value equals to val, then we have to remove last node
        temp.next = null;
        return result.next;
    }
}
