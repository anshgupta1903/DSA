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
        if(lists.length == 0)return null;
        ListNode head = lists[0];
        for(int i=1;i<lists.length;i++){
            head = merge2lists(head, lists[i]);
        }
        return head;
    }
    public ListNode merge2lists(ListNode l1, ListNode l2){
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                dummy.next = new ListNode(t1.val);
                t1 = t1.next;
                dummy = dummy.next;
            }
            else{
                dummy.next = new ListNode(t2.val);
                t2 = t2.next;
                dummy = dummy.next;
            }
        }
        if(t1 ==null) dummy.next = t2;
        else if(t2==null) dummy.next = t1;
        return res.next;
    } 
}