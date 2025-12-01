class Solution {
    public int maxSumDivThree(int[] arr) {
        int[][]dp=new int[arr.length][4];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
        return fun(arr,0,0,dp);
    }

    public int fun(int[]arr,int i,int rem,int [][]dp){
        if(i==arr.length){
            if(rem==0) return 0;
            return Integer.MIN_VALUE;
        }
        if(dp[i][rem]!=-1) return dp[i][rem];
        int in=arr[i]+fun(arr,i+1,(rem+arr[i]%3)%3,dp);
        int ex=fun(arr,i+1,rem,dp);
        return dp[i][rem]=Math.max(in,ex);
    }
}