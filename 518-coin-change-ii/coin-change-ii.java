class Solution {
    public int change(int amount, int[] coins) {
        int[][]dp=new int[amount+1][coins.length];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        return fun(amount,coins,0,dp);
    }

    public int fun(int amount,int[]coin,int i,int[][]dp){
        if(amount==0) {
            return 1;
        }
        if(amount<0 || i>=coin.length) return 0;
        if(dp[amount][i]!=-1) return dp[amount][i];
        int in=fun(amount-coin[i],coin,i,dp);
        int ex=fun(amount,coin,i+1,dp);
        return dp[amount][i]=ex+in;
    }
}