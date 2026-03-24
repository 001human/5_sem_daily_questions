class Solution {
    static int val=20000;
    public int findTargetSumWays(int[] arr, int t) {
        int[][]dp=new int[arr.length+1][40001];
        for(int[]a:dp){
            Arrays.fill(a,Integer.MIN_VALUE);
        }
        return fun(arr,t,0,0,dp);
    }

    public int fun(int[]arr,int t,int sum,int i,int[][]dp){
        if(i==arr.length && sum==t){
            return 1;
        }
        if(i>=arr.length) return 0;
        if(dp[i][sum+val]!=Integer.MIN_VALUE) return dp[i][sum+val];
        return dp[i][sum+val] = fun(arr,t,sum+arr[i],i+1,dp) + fun(arr,t,sum-arr[i],i+1,dp);
    }
}