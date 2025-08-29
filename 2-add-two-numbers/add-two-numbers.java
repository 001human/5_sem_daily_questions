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
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        while(l1!=null){
            sb1.append(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            sb2.append(l2.val);
            l2=l2.next;
        }
        String s1=sb1.reverse().toString();
        String s2=sb2.reverse().toString();
        String s3="";
        if(s1.length()>s2.length()){
            s3=add(s1,s2);
        }
        else{
            s3=add(s2,s1);
        }

        ListNode ans=new ListNode();
        ListNode dummy=ans;
        for(int i=0;i<s3.length();i++){
            int x=s3.charAt(i)-'0';
            ListNode nn=new ListNode();
            nn.val=x;
            ans.next=nn;
            ans=ans.next;
        }
        return dummy.next;
    }

    public String add(String s1,String s2){
        String ans="";
        int i1=s1.length()-1;
        int i2=s2.length()-1;
        int carry=0;
        while(i2>=0){
            int sum=s1.charAt(i1)-'0'+s2.charAt(i2)-'0'+carry;
            carry=sum/10;
            sum=sum%10;
            ans=ans+sum;
            i1--;
            i2--;
        }

        while(i1>=0){
            int sum=s1.charAt(i1)-'0'+carry;
            carry=sum/10;
            sum=sum%10;
            ans=ans+sum;
            i1--;
        }
        if(carry!=0) ans=ans+carry;
        return ans;
    }
}
