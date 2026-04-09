class Solution {
    public int minRemovals(int[] arr, int t) {
        int[][]dp=new int[arr.length+1][40001];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        int ans = fun(arr,t,0,dp);
        if(ans==Integer.MIN_VALUE) return -1;
        return arr.length-ans;
    }

    public int fun(int[]arr,int t,int i,int[][]dp){
        if(i==arr.length) {
            if(t==0) return 0;
            return Integer.MIN_VALUE;
        }
        if(i>=arr.length) return Integer.MIN_VALUE;
        if(dp[i][t]!=-1) return dp[i][t];

        int take =fun(arr,t^arr[i],i+1,dp);
        if(take!=Integer.MIN_VALUE) take+=1;
        int skip = fun(arr,t,i+1,dp);
        return dp[i][t] = Math.max(take,skip);
    }
}