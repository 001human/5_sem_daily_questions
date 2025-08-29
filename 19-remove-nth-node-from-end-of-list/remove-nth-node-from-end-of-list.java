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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(head==null) return null;
        if(head.next==null && n==1) return null;
        int x=c-n;
        if(x==0) return head.next;
        ListNode cur=head;
        while(--x>0){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}