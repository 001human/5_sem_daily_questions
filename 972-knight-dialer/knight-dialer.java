class Solution {
    static long mod=1000000007;
    public int knightDialer(int n) {
        
        int[][]arr=new int[4][3];
        int in=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(i==3 && ( j==0 || j==2 )) arr[i][j]=-1;
                else arr[i][j]=in++;
            }
        }
        long ans=0;
        int[][][]dp=new int[4][3][n+1];
        for(int[][]ar:dp){
            for(int[]a:ar){
                Arrays.fill(a,-1);
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]!=-1) ans=(ans+fun(arr,i,j,n-1,dp)%mod);
            }
        }
        return (int)(ans%mod);
    }

    public long fun(int[][]arr,int i,int j,int n,int[][][]dp){
        if(i>=arr.length || j>=arr[0].length  || i<0 || j<0 ) return 0;
        if(arr[i][j]==-1) return 0;
        if(n==0){
            return 1;
        }
        if(dp[i][j][n]!=-1) return dp[i][j][n];
        //total 8 directions over which knight can travel 

        long a=fun(arr,i-2,j-1,n-1,dp);
        long b=fun(arr,i-1,j-2,n-1,dp);
        long c=fun(arr,i-1,j+2,n-1,dp);
        long d=fun(arr,i-2,j+1,n-1,dp);
        long e=fun(arr,i+1,j-2,n-1,dp);
        long f=fun(arr,i+2,j-1,n-1,dp);
        long g=fun(arr,i+1,j+2,n-1,dp);
        long h=fun(arr,i+2,j+1,n-1,dp);
        return dp[i][j][n]=(int)((a+b+c+d+e+f+g+h)%mod);
    }
}