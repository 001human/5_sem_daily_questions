class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int[]dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        int first=fun(dp,0,arr);
        int sec=fun(dp,1,arr);
        return Math.min(first,sec);
    }

    public int fun(int[]dp,int i,int[]arr){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int one=arr[i]+fun(dp,i+1,arr);
        int two=arr[i]+fun(dp,i+2,arr);
        return dp[i]=Math.min(one,two);
    }
}
