class Solution {
    public int minFlipsMonoIncr(String s) {
        // //finding flips to convert all to 0 and 1
        int one=0;
        int zero=0;
        for(char ch:s.toCharArray()){
            if(ch=='0') zero++;
            else one++;
        }
        if(one==s.length() || zero==s.length()) return 0;

        int ans=Math.min(one,zero);
        int[]pre=new int[s.length()];
        int t=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1') t++;
            pre[i]=t;
        }

        int[]suf=new int[s.length()+1];
        t=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='0') t++;
            suf[i]=t;
        }

        for(int i=0;i<s.length();i++){
            ans=Math.min(ans,pre[i]+suf[i+1]);
        }
        return ans;
    }
}