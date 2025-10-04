class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return fun(arr,dp,0);
    }

    public int fun(int[]arr,int[]dp,int i){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob=arr[i]+fun(arr,dp,i+2);
        int np=fun(arr,dp,i+1);
        return dp[i]=Math.max(rob,np);
    }
}