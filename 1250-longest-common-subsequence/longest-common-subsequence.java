class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int[][]dp=new int[t1.length()][t2.length()];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return fun(t1,t2,0,0,dp);
    }

    public int fun(String t1, String t2,int i, int j,int[][]dp){
        if(i>=t1.length() || j>=t2.length() || t1.equals("") || t2.equals("")) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(t1.charAt(i)==t2.charAt(j)){
            ans=1+fun(t1,t2,i+1,j+1,dp);
        }
        else {
            int f=fun(t1,t2,i+1,j,dp);
            int l=fun(t1,t2,i,j+1,dp);
            ans=Math.max(f,l);
        }
        return dp[i][j]=ans;
    }
}

