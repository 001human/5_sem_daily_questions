class Solution {
    public int minOperations(String s) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            String t=s.substring(i,s.length())+s.substring(0,i);
            int val=ispos(t)+i;
            ans=Math.min(ans,val);
        }
        return ans;
    }
    
    public int ispos(String s){
        int start=0;
        int end=s.length()-1;
        int ans=0;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                int temp=0;
                char ch1=s.charAt(start);
                char ch2=s.charAt(end);
                if(ch1<ch2){
                    int t1=(int)(ch2-ch1);
                    int t2=(int)('z'-ch2)+ (int)(ch1-'a')+1;
                    temp=Math.min(t1,t2);
                }
                else{
                    int t1=(int)(ch1-ch2);
                    int t2=(int)('z'-ch1)+ (int)(ch2-'a')+1;
                    temp=Math.min(t1,t2);
                }
                ans+=temp;
                start++;
                end--;
            }
        }
        return ans;
    }
}