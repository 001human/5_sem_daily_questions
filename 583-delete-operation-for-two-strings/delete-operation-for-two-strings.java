class Solution {
    public int minDistance(String s1, String s2) {
        //find the cs and subtract length of it from both string 
        int[][]dp=new int[s1.length()][s2.length()];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
        int ans=fun(s1,s2,0,0,dp);
        return s1.length()+s2.length()-2*ans;
    }

    public int fun(String a,String b,int i,int j,int[][]dp){
        if(i==a.length()) return 0;
        if(j==b.length()) return 0;
        int y=0;
        int no=0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)){
            y=1+fun(a,b,i+1,j+1,dp);
        }
        else no=Math.max(fun(a,b,i+1,j,dp),fun(a,b,i,j+1,dp));
        return dp[i][j]=y+no;
    }
}