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
        int c=0;
        if(k==0 || head==null) return head;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        k=k%c;
        if (head==null || head.next==null || c<2 || k==0) return head;
        int a=c-k;
        ListNode cur12=head;
        ListNode cur1=head;
        ListNode pre=null;
        while(a-->0){
            pre=cur1;
            cur1=cur1.next;
        }
        pre.next=null;

        ListNode cur2=cur1; //cur2 points to 4
        ListNode pre2=cur1;
        while(pre2.next!=null){
            pre2=pre2.next;
        }
        pre2.next=cur12;
        return cur2;
    }
}