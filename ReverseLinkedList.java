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
        if (head == null) return null;
        Stack<ListNode> nodes = new Stack<ListNode>();
        while (head.next != null) {
            nodes.push(head);       
            head = head.next;
        }
        
        ListNode result = head;
        while (!nodes.empty()) {
            head.next = nodes.pop();
            head = head.next;
        }
        head.next = null;
        return result;
    }
}
