class Solution {
    public int minimumNumbers(int num, int k) {
        if(num%2==1 && k%2==0) return -1;
        if(num==0) return 0;
        int[]dp=new int[num+1];
        Arrays.fill(dp,-1);
        int a= fun(num,k,0,0,dp);
        return a == Integer.MAX_VALUE ? -1 :a;
    }

    public int fun(int n,int k,int t,int s,int[]dp){
        if(s>n) return Integer.MAX_VALUE;
        if(n==s){
            return t;
        }
        if(dp[n]!=-1) return dp[n];
        int ans=Integer.MAX_VALUE;
        for(int i=k;i<=n;i+=10){
            if(i==0) continue;
            int a= fun(n,k,t+1,s+i,dp);
            if(a!=Integer.MAX_VALUE){
                ans=Math.min(ans,a);
            }
        }
        return dp[n]=ans;
    }
}