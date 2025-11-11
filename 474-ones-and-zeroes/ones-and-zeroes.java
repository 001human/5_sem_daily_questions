class Solution {
    public int findMaxForm(String[] arr, int m, int n) {
        int n1=arr.length;
        int[]one=new int[n1];
        int[]z=new int[n1];
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch=='0') z[i]++;
                else one[i]++;
            }
        }
        int[][][]dp=new int[m+1][n+1][arr.length];
        for(int[][]p:dp){
            for(int[]r:p){
                Arrays.fill(r,-1);
            }
        }
        return fun(z,one,m,n,0,dp);
    }

    public int fun(int[]z,int[]o,int m,int n,int i,int[][][]dp){
        if(i>=z.length) return 0;
        int y=0;
        int no=0;
        if(dp[m][n][i]!=-1) return dp[m][n][i];
        if(z[i]<=m && o[i]<=n){
            y=1+fun(z,o,m-z[i],n-o[i],i+1,dp);
        }
        no=fun(z,o,m,n,i+1,dp);
        return dp[m][n][i] = Math.max(y,no);
    }
}