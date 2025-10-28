class Solution {
    public int coinChange(int[] arr, int amount) {
        int[][]dp=new int[arr.length][amount+1];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        int ans= fun(arr,amount,0,dp);
        return ans!=Integer.MAX_VALUE?ans:-1;
    }

    public int fun(int[]arr,int amount,int i,int[][]dp){
        if(amount==0) return 0;
        if(amount<0 || i>=arr.length) return Integer.MAX_VALUE;
        if(dp[i][amount]!=-1) return dp[i][amount];
        //do
        int d=Integer.MAX_VALUE;
        int a=fun(arr,amount-arr[i],i,dp);
        if(a!=Integer.MAX_VALUE) d=1+a;
        //not do
        int no=fun(arr,amount,i+1,dp);
        return dp[i][amount]=Math.min(d,no);
    }
}