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
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        int total = 0;
        while(l1!=null || l2!=null){
            if(l1!=null){
                total += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                total += l2.val;
                l2 = l2.next;
            }
            dummy.next = new ListNode(total % 10);
            dummy = dummy.next;
            total = total / 10;
        }
        if(total!=0){
            dummy.next = new ListNode(total);
        }
        return result.next;
    }
}