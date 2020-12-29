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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = head2;
        ListNode node = head2.next;
        while(node!=null){
            curr.next = prev;
            prev = curr;
            curr = node;
            node = node.next;
        }
        curr.next = prev;
        
        while(curr!=null){
            if(curr.val!=head.val){
                return false;
            }else{
                curr = curr.next;
                head = head.next;
            }
        }
        return true;
    }
}