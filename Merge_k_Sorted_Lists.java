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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(ListNode head : lists){
            while(head!=null){
                heap.add(head.val);
                head = head.next;
            }
        }
        ListNode result = new ListNode(0);
        ListNode curr = result;
        while(!heap.isEmpty()){
            curr.next = new ListNode(heap.poll());
            curr = curr.next;
        }
        return result.next;
    }
}