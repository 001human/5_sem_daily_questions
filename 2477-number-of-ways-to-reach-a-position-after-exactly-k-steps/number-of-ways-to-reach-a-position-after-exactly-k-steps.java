class Solution {
    int mod=1000000007;
    public int numberOfWays(int start, int end, int k) {
        int[][]dp=new int[4004][k+1];
        for(int[]ar:dp){
            Arrays.fill(ar,10001);
        }
        return fun(start,end,k,0,dp)%mod;
    }

    public int fun(int start,int end,int k,int cur,int[][]dp){
        if(cur==k && start==end){
            return 1;
        }
        if(cur>k) return 0;
        if(dp[start+1000][cur]!=10001) return dp[start+1000][cur];
        int a=fun(start+1,end,k,cur+1,dp)%mod;
        int b=fun(start-1,end,k,cur+1,dp)%mod;
        return dp[start+1000][cur]=(a+b)%mod;
    }
}