class Solution {
    static int mod=1000000007;
    public int numberOfPaths(int[][] arr, int k) {
        int m=arr.length;
        int n=arr[0].length;
        int[][][]dp=new int[m][n][k];
        for(int[][]ar:dp){
            for(int[]a:ar){
                Arrays.fill(a,-1);
            }
        }
        return fun(arr,0,0,m,n,k,0,dp)%mod;
    }

    public int fun(int[][]arr,int i,int j,int m,int n,int k,int sum,int[][][]dp){
        if(i==m-1 && j==n-1){
            sum=(sum+arr[i][j])%mod;
            if(sum%k==0) return 1;
            return 0;
        }
        if(i>=m || j>=n) return 0;
        if(dp[i][j][sum%k]!=-1) return dp[i][j][sum%k];
        int d=fun(arr,i+1,j,m,n,k,sum+arr[i][j],dp);
        int u=fun(arr,i,j+1,m,n,k,sum+arr[i][j],dp);
        return dp[i][j][sum%k]=(d+u)%mod;
    }
}