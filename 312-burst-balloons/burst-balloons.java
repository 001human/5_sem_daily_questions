class Solution {
    public int maxCoins(int[] arr1) {
        int[]arr=new int[arr1.length+2];
        for(int i=0;i<arr1.length;i++){
            arr[i+1]=arr1[i];
        }
        int[][]dp=new int[arr.length][arr.length];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
        arr[0]=1;
        arr[arr.length-1]=1;
        return fun(arr,0,arr.length-1,dp);
    }

    public int fun(int[]arr,int i,int j,int[][]dp){
        if(i+1==j) return 0;
        int ans=Integer.MIN_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        for(int k=i+1;k<j;k++){
            int fs=fun(arr,i,k,dp);
            int ss=fun(arr,k,j,dp);
            int self=arr[i]*arr[j]*arr[k];
            ans=Math.max(ans,fs+ss+self);
        }
        return dp[i][j]=ans;
    }
}