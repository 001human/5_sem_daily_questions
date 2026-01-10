class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][]dp=new int[s1.length()][s2.length()];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return fun(s1,s2,0,0,dp);
    }

    public int fun(String s1,String s2,int i,int j,int[][]dp){
        if(i==s1.length()){
            int t=0;
            for(int k=j;k<s2.length();k++){
                t+=(int)s2.charAt(k);
            }
            return t;
        }
        if(j==s2.length()){
            int t=0;
            for(int k=i;k<s1.length();k++){
                t+=(int)s1.charAt(k);
            }
            return t;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int p=Integer.MAX_VALUE;
        int np=Integer.MAX_VALUE;
        if(s1.charAt(i)==s2.charAt(j)){
            p=fun(s1,s2,i+1,j+1,dp);
        }
        else{
            int a=(int)s1.charAt(i)+fun(s1,s2,i+1,j,dp);
            int b=(int)s2.charAt(j)+fun(s1,s2,i,j+1,dp);
            np=Math.min(a,b);
        }
        int fin= Math.min(p,np);
        if(fin==Integer.MAX_VALUE) return 0;
        return dp[i][j]=fin;
    }
}
