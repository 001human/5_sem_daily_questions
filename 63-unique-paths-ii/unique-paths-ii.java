class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][]dp=new int[m+1][n+1];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        return fun(arr,0,0,dp);
    }

    public int fun(int[][]arr, int i,int j,int[][]dp){
        if(i==arr.length-1 && j==arr[0].length-1 && arr[i][j]!=1) {
            return 1;
        }
       if(dp[i][j]!=-1) return dp[i][j];
        if(i>=arr.length || j>=arr[0].length || arr[i][j]==1) return 0;
         int ans=0;
        ans=fun(arr,i+1,j,dp)+fun(arr,i,j+1,dp);
        return dp[i][j]=ans;
    }
}
