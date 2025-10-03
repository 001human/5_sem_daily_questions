class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n=arr.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(fun(arr,dp,n-1),fun(arr,dp,n-2));
    }
    
    public int fun(int[]arr,int[]dp,int i){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]= arr[i]+Math.min(fun(arr,dp,i-1),fun(arr,dp,i-2));
    }
}