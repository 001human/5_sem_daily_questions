class Solution {
    public int longestPalindromeSubseq(String s1) {
        String s2= new StringBuilder(s1).reverse().toString();
        int[][]dp=new int[s1.length()][s2.length()];
        for(int[]ar:dp){
            Arrays.fill(ar,-1);
        }
        return fun(s1,s2,0,0,dp);
    }

    public int fun(String s1,String s2,int i,int j,int[][]dp){
        if(i==s1.length() || j==s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+fun(s1,s2,i+1,j+1,dp);
        }
        else{
            ans=ans+Math.max(fun(s1,s2,i+1,j,dp),fun(s1,s2,i,j+1,dp));
        }
        return dp[i][j]=ans;
    }

}