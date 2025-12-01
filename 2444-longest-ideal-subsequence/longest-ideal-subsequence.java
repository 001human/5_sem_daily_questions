class Solution {
    static int ans;
    public int longestIdealString(String s, int k) {
        ans=0;
        int[][]dp=new int[s.length()][27];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
        return fun(s,k,0,26,dp);
    }

    public int fun(String s,int k,int i,int pre,int[][]dp){
        if(i==s.length()) return 0;
        if(dp[i][pre]!=-1) return dp[i][pre];
        int in=0;
        int ex=0;
        int cur=(s.charAt(i)-'a');
        if(Math.abs(cur-pre)<=k || pre==26){
            in=1+fun(s,k,i+1,cur,dp);
        }
        ex=fun(s,k,i+1,pre,dp);
        return dp[i][pre]=Math.max(in,ex);
    }
}