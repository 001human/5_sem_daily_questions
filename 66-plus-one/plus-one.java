class Solution {
    public int[] plusOne(int[] arr) {
       
       String s="";
       for(int i=0;i<arr.length;i++){
        s=s+arr[i];
       } 

       int ind=s.length()-1;
       String ans="";
       int carry=0;

       while(ind>=0){
        if(ind==s.length()-1){
            int sum=s.charAt(ind)-'0'+1;
            carry=sum/10;
            ans=ans+sum%10;
            ind--;
        }
        else{
            int sm=s.charAt(ind)-'0'+carry;
            carry=sm/10;
            ans=ans+sm%10;
            ind--;
        }
       }
       if(carry!=0){
        ans=ans+carry;
       }
       
       StringBuilder f=new StringBuilder(ans);
       f.reverse();
       ans=f.toString();

       int[]fin=new int[ans.length()];
       for(int i=0;i<ans.length();i++){
        fin[i]=ans.charAt(i)-'0';
       }
       return fin;
    }
}