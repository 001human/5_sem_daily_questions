class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int[]dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        return Math.min(fun(dp,0,arr),fun(dp,1,arr));
    }

    public int fun(int[]dp,int i,int[]arr){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=arr[i]+Math.min(fun(dp,i+1,arr),fun(dp,i+2,arr));
    }
}
