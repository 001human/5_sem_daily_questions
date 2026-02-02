class Solution {
    static int mod=1000000007;
    public int countHousePlacements(int n) {
       int[][]dp=new int[n+1][2];
       for(int[]a:dp){
        Arrays.fill(a,-1);
       }
       long ans=fun(n,0,dp)%mod;
       return (int)( ((ans%mod) * (ans%mod))%mod );
    }

    public int fun(int n,int pre,int[][]dp){
        if(n<0) return 0;
        if(n==0){
            return 1;
        }
        if(dp[n][pre]!=-1) return dp[n][pre];
        int p=0;
        int np=0;
        if(pre==0) p=fun(n-1,1,dp)%mod;
        np=fun(n-1,0,dp)%mod;
        return dp[n][pre]=(p+np)%mod;
    }
}