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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode result = head;
        while (head != null) {
            int preVal = head.val;
            if (head.next != null && head.next.val == preVal) {
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
        }
         
        return result;
    }
}
