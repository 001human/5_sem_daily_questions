class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        if(n<=2) return n;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        // return hello(n,dp);
    }
    //recursion
    // public int hello(int n){
    //     if(n<=2){
    //         return n;
    //     }
    //     return hello(n-1)+hello(n-2);
    // }


    //memoization (top-bottom)

    // public int hello(int n,int[]dp){
    //     if(n<=2){
    //         return n;
    //     }
    //     if(dp[n]!=-1) return dp[n];
    //     dp[n]=hello(n-1,dp) + hello(n-2,dp);
    //     return dp[n];
    // }

    //tabulation (bottom-top)
    


}