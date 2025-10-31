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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=null;
        while(fast!=null && fast.next!=null){
            pre=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        pre.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        return merge(left,right);
    }

    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(left!=null && right!=null){
            if(left.val<right.val){
                dummy.next=left;
                dummy=dummy.next;
                left=left.next;
            }
            else{
                dummy.next=right;
                dummy=dummy.next;
                right=right.next;
            }
        }
       if(left==null){
            dummy.next=right;
        }
        if(right==null){
            dummy.next=left;
        }
        return temp.next;
    }
    
    
}