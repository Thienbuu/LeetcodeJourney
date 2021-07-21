/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == 0xabcdef) return true;
            //mark current valuecan be revisited
            head.val = 0xabcdef;
            head = head.next; 
        }
        return false;
    }
}
