class Solution {
    public int numDistinct(String s, String t) {
        int[][]dp=new int[s.length()][t.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(s,t,0,0,dp);
    }

    public int fun(String s,String t,int i,int j,int[][]dp){
        if(j==t.length()) {
            return 1;
        }
        if(i>=s.length() || j>=t.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int in=0,ex=0;
        if(s.charAt(i)==t.charAt(j)){
           in = fun(s,t,i+1,j+1,dp);
        }
        ex = fun(s,t,i+1,j,dp);
        return dp[i][j]=in+ex;
    }
}