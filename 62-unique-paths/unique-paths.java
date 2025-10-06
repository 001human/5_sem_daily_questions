class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m+1][n+1];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return fun(m,n,0,0,dp);
    }

    public int fun(int m ,int n, int i,int j,int[][]dp){
        if(i==m-1 && j==n-1) {
            return 1;
        }
       if(dp[i][j]!=-1) return dp[i][j];
        if(i>=m || j>=n) return 0;
         int ans=0;
        ans=fun(m,n,i+1,j,dp)+fun(m,n,i,j+1,dp);
        return dp[i][j]=ans;
    }
}