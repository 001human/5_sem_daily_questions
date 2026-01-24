class Solution {
    public int minimizeTheDifference(int[][] arr, int t) {
        int[][]dp=new int[arr.length][70*70+1];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return fun(arr,t,0,0,dp);
    }

    public int fun(int[][]arr,int t,int r,int s,int[][]dp){

        if(r==arr.length){
           return Math.abs(t-s);
        }
        if(dp[r][s]!=-1) return dp[r][s];
        int ans=Integer.MAX_VALUE;
        for(int val:arr[r]){
            ans=Math.min(ans,fun(arr,t,r+1,s+val,dp));
        }
        return dp[r][s]= ans;
    }
}