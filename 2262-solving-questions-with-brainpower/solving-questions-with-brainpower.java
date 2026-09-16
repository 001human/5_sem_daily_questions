class Solution {
    public long mostPoints(int[][] arr) {
        long[]dp=new long[arr.length];
        Arrays.fill(dp,-1);
        return fun(arr,0,dp);
    }

    public long fun(int[][]arr,int i,long[]dp){
        if(i>=arr.length) {
            return 0;
        }
        //take if there is no questions to be skipped
        if(dp[i]!=-1) return dp[i];
        long tk = arr[i][0] + fun(arr,i+arr[i][1]+1,dp);
        //do not take 
        long nt = fun(arr,i+1,dp);
        return dp[i]=Math.max(tk,nt);
    }
}