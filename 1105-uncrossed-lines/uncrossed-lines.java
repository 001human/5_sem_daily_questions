class Solution {
    public int maxUncrossedLines(int[] arr1, int[] arr2) {
        int[][]dp=new int[arr1.length][arr2.length];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        return fun(arr1,arr2,0,0,dp);
    }

     public int fun(int[] s1,int[] s2,int i,int j,int[][]dp){
        if(i==s1.length || j==s2.length) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(s1[i]==s2[j]){
            ans=1+fun(s1,s2,i+1,j+1,dp);
        }
        else{
            ans=ans+Math.max(fun(s1,s2,i+1,j,dp),fun(s1,s2,i,j+1,dp));
        }
        return dp[i][j]=ans;
    }
}