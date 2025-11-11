class Solution {
    public boolean canPartition(int[] arr) {
        int t=0;
        for(int n:arr){t+=n;}
        if(t%2==1) return false;
        Boolean[][]dp=new Boolean[arr.length][t/2+1];
        return fun(arr,0,t/2,dp);
    }
//instead of using 3d dp ofr s1,s2,i we use a 2d dp of i and difference 

    public boolean fun(int[]arr,int i,int t,Boolean[][]dp){
        if(t==0) return true;
        if(t<0 || i>=arr.length) return false;
        if(dp[i][t]!=null) return dp[i][t];
        return dp[i][t]=fun(arr,i+1,t-arr[i],dp) || fun(arr,i+1,t,dp);
    }
}

