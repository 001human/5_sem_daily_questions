class Solution {    //2d dp as both i and j are changing
    public int minDistance(String w1, String w2) {
        int[][]dp=new int[w1.length()][w2.length()];
        return fun(w1,w2,0,0,dp);
    }

    public int fun(String w1, String w2,int i,int j,int[][]dp){
        if(i==w1.length()) return w2.length()-j;
        if(j==w2.length()) return w1.length()-i;
        if(dp[i][j]!=0) return dp[i][j];
        //we can perform delte ,insert and replace operations if character is not matched else move forward
        int ans=0;
        if(w1.charAt(i)==w2.charAt(j)){
           ans=fun(w1,w2,i+1,j+1,dp);
        }
        else {
            int del=1+fun(w1,w2,i+1,j,dp);
            int ins=1+fun(w1,w2,i,j+1,dp);
            int repl=1+fun(w1,w2,i+1,j+1,dp);
            ans=Math.min(Math.min(del,ins),repl);
        }
        return dp[i][j]=ans;
    }
}
