class Solution {
    public long maxAlternatingSum(int[] arr) {
        long[][]dp=new long[arr.length][2];
        for(long[]a:dp){
            Arrays.fill(a,-1);
        }
        return fun(arr,0,0,dp);
    }

    public long fun(int[]arr,int i,int s,long[][]dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i][s]!=-1) return dp[i][s];
        long tk=0;
        long nt=0;
        long ans=0;
        if(s==0) tk= arr[i] + fun(arr,i+1,1,dp);
        else if(s==1) tk = -arr[i] + fun(arr,i+1,0,dp);
        nt = fun(arr,i+1,s,dp);
        return dp[i][s] = Math.max(nt,tk);
    }
}