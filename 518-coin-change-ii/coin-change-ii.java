class Solution {
    public int change(int a, int[] arr) {
        int[][]dp=new int[a+1][arr.length];
        for(int []n:dp){
            Arrays.fill(n,-1);
        }
        return fun(a,arr,0,dp);
    }

    public int fun(int a,int[]arr,int i,int[][]dp){
        if(a==0) {
            return 1;
        }
        int ex=0;
        int in=0;
        if(i>=arr.length || a<0) return 0;
        if(dp[a][i]!=-1) return dp[a][i];
        if(a>=arr[i]) in=fun(a-arr[i],arr,i,dp);
        ex=fun(a,arr,i+1,dp);
        return dp[a][i]=ex+in;
    }
}