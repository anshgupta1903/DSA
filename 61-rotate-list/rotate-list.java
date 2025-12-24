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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode res = new ListNode(-1);
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        k = k%size;
        temp = head;
        for(int i=0;i<size-k-1;i++){
            temp = temp.next;
        }
        dummy.next = temp.next;
        temp.next = null;
        res.next = dummy;

        // res.next = head;
        ListNode temp2 = res;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = head;

        return res.next.next;
    }
}