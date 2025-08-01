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
        ListNode temp1=l1;
        ListNode temp2=l2;
        String ss1="";
        while(temp1!=null){
            ss1=ss1+temp1.val;
            temp1=temp1.next;
        }
        
        String ss2="";
        while(temp2!=null){
            ss2=ss2+temp2.val;
            temp2=temp2.next;
        }

        StringBuilder a1=new StringBuilder(ss1);
        a1.reverse();
        String s1=a1.toString();

        StringBuilder a2=new StringBuilder(ss2);
        a2.reverse();
        String s2=a2.toString();

        String ans="";
        if(s1.length()<s2.length()){
            ans=ans+add(s1,s2);
        }
        else{
           ans=ans + add(s2,s1);
        }

        StringBuilder t=new StringBuilder(ans);
        t.reverse();
        String ans1=t.toString();

        ListNode ad=new ListNode(0);
        ListNode cur=ad;
        int index=ans1.length()-1;
        while(index>=0){
            ListNode nn=new ListNode(ans1.charAt(index)-'0');
            ad.next=nn;
            ad=ad.next;
            index--;
        }

        return cur.next;

    }

    public static String add(String s1,String s2){
        int ind1=s1.length()-1;
        int ind2=s2.length()-1;
        String ans="";
        int sum=0;
        int carry=0;
        while(ind1>=0){
            int x=s1.charAt(ind1)-'0'+s2.charAt(ind2)-'0'+carry;
            sum=x%10;
            ans=ans+String.valueOf(sum);
            carry=x/10;
            ind1--;
            ind2--;
        }

        while(ind2>=0){
            int x=s2.charAt(ind2)-'0'+carry;
            sum=x%10;
            ans=ans+String.valueOf(sum);
            carry=x/10;
            ind2--;
        }

        if(carry!=0){
            ans=ans+carry;
        }        
        return ans;
    }
}