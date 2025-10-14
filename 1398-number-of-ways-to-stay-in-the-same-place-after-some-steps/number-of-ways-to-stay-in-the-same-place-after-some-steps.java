class Solution {
    int mod=1000000007;
    public int numWays(int steps, int len) {
        int x=Math.min(len,steps);
        int[][]dp=new int[x+1][steps+1];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        return fun(steps,x,0,0,dp)%mod;
    }

    public int fun(int step,int len, int c,int pos,int[][]dp){
        if(c==step && pos==0 ){
            return 1;
        }
        if(pos>=len || pos<0 || c>step) return 0;
        if(dp[pos][c]!=-1) return dp[pos][c];
        int a=fun(step,len,c+1,pos+1,dp)%mod;
        int b=fun(step,len,c+1,pos-1,dp)%mod;
        int z=fun(step,len,c+1,pos+0,dp)%mod;
        return dp[pos][c]=(int)(((long)a+b+z)%mod);
    }
}