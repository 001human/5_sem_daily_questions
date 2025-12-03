class Solution {
    //d=0 means you can buy and d=1 mean sell at this day
    public int maxProfit(int[] arr) {
        int[][][]dp=new int[arr.length][2][3];
        for(int[][]d:dp){
            for(int[]a:d){
                Arrays.fill(a,-1);
            }
        }
        return fun(arr,0,0,2,dp);
    }

    public int fun(int[]arr,int i,int d,int k,int[][][]dp){
        if(i>=arr.length || k==0){
            return 0;
        }
        if(dp[i][d][k]!=-1) return dp[i][d][k];
        int take=0;
        int nt=0;
        if(d==0){
            take=-arr[i]+ fun(arr,i+1,1,k,dp);
        }
        else if(d==1){
            take=arr[i]+ fun(arr,i+1,0,k-1,dp);
        }
        nt=fun(arr,i+1,d,k,dp);
        return dp[i][d][k]=Math.max(take,nt);
    }
}