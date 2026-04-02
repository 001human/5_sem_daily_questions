class Solution {
    int[][][] dp;
    public int maximumAmount(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        dp=new int[m][n][3];
        for(int[][]aa:dp){
            for(int[]a:aa){
                Arrays.fill(a,Integer.MIN_VALUE/2);
            }
        }
        return fun(arr,0,0,2);
    }

    public int fun(int[][]arr,int i,int j,int max){
        if(i==arr.length-1 && j==arr[0].length-1){
            if(arr[i][j]<0 && max>0) return 0;
            return arr[i][j];
        }

        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length) return Integer.MIN_VALUE/2;
        if (dp[i][j][max] != Integer.MIN_VALUE/2) {
            return dp[i][j][max];
        }

        int fin=Integer.MIN_VALUE/2;
        if(arr[i][j]>=0){
            int d= fun(arr,i+1,j,max);
            int r=fun(arr,i,j+1,max);
            fin=arr[i][j]+Math.max(d,r);
        }
        else{
            if(max>0){
                int d=fun(arr,i+1,j,max-1);
                int r=fun(arr,i,j+1,max-1);
                int skip=Math.max(r,d);
                fin=Math.max(d,r);
            }
            //take -ve values keep max for further use if more greater -ve number occur
            int d= fun(arr,i+1,j,max);
            int r= fun(arr,i,j+1,max);
            int take=arr[i][j]+Math.max(d,r);
            fin=Math.max(fin,take);
            
        }
        return dp[i][j][max]=fin;
    }
}