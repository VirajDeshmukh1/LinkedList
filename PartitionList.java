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
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode(0);
        ListNode dummy1 = list1;
        ListNode list2 = new ListNode(0);
        ListNode dummy2 = list2;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val>=x){
                dummy2.next = new ListNode(curr.val);
                dummy2 = dummy2.next; 
            }else{
                dummy1.next = new ListNode(curr.val);
                dummy1 = dummy1.next;
            }
            curr = curr.next;
        }
        dummy2.next = null;
        dummy1.next = list2.next;
        return list1.next;
    }
}