class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[][]dp=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else {
                    int left=dp[i][j-1];
                    int up=dp[i-1][j];
                    dp[i][j]=Math.max(left,up);
                }
            }
        }
        return dp[n][m];
    }
}


//top bottom

// class Solution {
//     public int longestCommonSubsequence(String s1, String s2) {
//         int[][]dp=new int[s1.length()][s2.length()];
//         for(int[]a:dp){
//             Arrays.fill(a,-1);
//         }
//         return fun(s1,s2,0,0,dp);
//     }

//     public int fun(String s1, String s2,int i,int j,int[][]dp){
//         if(i>=s1.length() || j>=s2.length()) return 0;
//         if(s1.equals("") || s2.equals("")) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];
//         int ans=0;
//         if(s1.charAt(i)==s2.charAt(j)) {
//             ans = 1+fun(s1,s2,i+1,j+1,dp);
//         }
//         else {
//             ans= Math.max(fun(s1,s2,i,j+1,dp), fun(s1,s2,i+1,j,dp));
//         }
//         return dp[i][j]=ans;
//     }
// }