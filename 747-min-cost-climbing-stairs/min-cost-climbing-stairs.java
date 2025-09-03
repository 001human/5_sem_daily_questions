class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n =arr.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        int a=fun(arr,dp,0);
        int b=fun(arr,dp,1);
        return Math.min(a,b);
    }

    public int fun(int[]arr,int[]dp,int i){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int one=arr[i]+fun(arr,dp,i+1);
        int two=arr[i]+fun(arr,dp,i+2);
        dp[i]=Math.min(one,two);
        return dp[i];
    }
}