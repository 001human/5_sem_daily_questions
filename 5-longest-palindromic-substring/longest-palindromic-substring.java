class Solution {
    static int max;
    static int st;
    static int ed;
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        max=0;
        st=0;
        ed=0;
        for(int i=0;i<s.length();i++){
            fun(s,i,i+1);
            fun(s,i-1,i+1);
        }
        return s.substring(st,ed+1);
    }

    public void fun(String s,int start,int end){
        int ans=0;
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            ans=end-start+1;
            if(ans>max){
                max=ans;
                st=start;
                ed=end;
            }
            start--;
            end++;
        }
    }
}