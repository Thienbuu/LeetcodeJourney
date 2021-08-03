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
    //For naive solution, use array list to add all node to list and compare each value
    
    //Reverse first half 
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode reverse = null;
        ListNode prev = null;
        //When fast at the end, slow must be the middle
        //Reverse first half
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            
            prev = reverse;
            reverse = slow;
            slow = slow.next;
            reverse.next = prev;
            
        }
        
        //If size of list is odd, the last position of fast is length - 1
        //then no need to worry about middle node, move slow to next node
        //Ex: [1,2,3,2,1]: ignore 3, just need to compare [1,2] and [2,1] of 2 halves
        if (fast != null) {
            slow = slow.next;
        }

        //Compare reversed first half and second half
        while (slow != null) {
            if (slow.val != reverse.val) return false;
            slow = slow.next;
            reverse = reverse.next;
        }

        return true;
    }
    
    //Reverse second half
//     public boolean isPalindrome(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;
//         //When fast at the end, slow must be the middle
//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;            
//         }
        
//         ListNode reverse = slow;
//         slow = slow.next;
//         reverse.next = null;
//         //Reverse second half
//         while (slow != null) {
//             ListNode prev = reverse;
//             reverse = slow;
//             slow = slow.next;
//             reverse.next = prev;
//         }
        
//         //Compare reversed first half and second half
//         while (reverse != null) {
//             if (reverse.val != head.val) return false;
//             reverse = reverse.next;
//             head = head.next;
//         }

//         return true;
//     }

}
