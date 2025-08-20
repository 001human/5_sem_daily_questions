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
    public ListNode mergeKLists(ListNode[] arr) {
        PriorityQueue<ListNode>pq=new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                return o1.val-o2.val;
            }
        });
        
        //comparable is used in same class whereas comparator can be used in different class
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                pq.add(arr[i]);
            }
        }
        
        while(!pq.isEmpty()){
            ListNode r=pq.poll();
            dummy.next=r;
            dummy=dummy.next;
            if(r.next!=null){
                pq.add(r.next);
            }
        }
        return temp.next;
    }
}