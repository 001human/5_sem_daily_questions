class Solution {
    public int change(int a, int[] coin) {
        int[][]dp=new int[a+1][coin.length];
        for(int[]ab:dp){
            Arrays.fill(ab,-1);
        }
        return fun(a,coin,0,dp);
    }

    public int fun(int a, int[] coin,int i,int[][]dp){
        if(a==0) return 1;
        if(i>=coin.length) return 0;
        if(dp[a][i]!=-1) return dp[a][i];
        int inc=0;
        int ex=0;
        if(a>=coin[i]) inc = fun(a-coin[i],coin,i,dp);
        ex=fun(a,coin,i+1,dp);
        return dp[a][i]=inc+ex;
    }
}