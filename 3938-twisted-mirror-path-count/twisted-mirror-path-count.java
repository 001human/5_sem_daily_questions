class Solution {
    public int uniquePaths(int[][] arr) {
        int[][][]dp=new int[arr.length][arr[0].length][2];
        for(int[][]d:dp){
            for(int[]ar:d){
                Arrays.fill(ar,-1);
            }
        }
        return fun(arr,0,0,arr.length,arr[0].length,0,dp)%1000000007;
    }

    public int fun(int[][]arr,int i,int j,int r,int c,int d,int[][][]dp){
        if(i==r-1 && j==c-1){
            return 1;
        }
        if(i>=r || j>=c) return 0;
        if(dp[i][j][d]!=-1) return dp[i][j][d];
        int right=0;
        int down=0;
        int right1=0;
        int down1=0;
        if(arr[i][j]==0){
            right=fun(arr,i+1,j,r,c,0,dp);
            down=fun(arr,i,j+1,r,c,1,dp);
        }
        else {
            if(d==0){
                down1=fun(arr,i,j+1,r,c,1,dp);
            }
            else{
                right1=fun(arr,i+1,j,r,c,0,dp);
            }
        }
        return dp[i][j][d]=(right+down+right1+down1)%1000000007;
    }
}