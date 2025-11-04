class Solution {
    public int countUnguarded(int m, int n, int[][] g, int[][] w) {
        int[][]arr=new int[m][n];
        for(int i=0;i<g.length;i++){
            int a=g[i][0];
            int b=g[i][1];
            arr[a][b]=1;
        }
        for(int i=0;i<w.length;i++){
            int a=w[i][0];
            int b=w[i][1];
            arr[a][b]=2;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    fun(arr,i,j);
                }
            }
        }
        //count the number of zeroes 
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0) ans++;
            }
        }
        return ans;
    }

    public void fun(int[][]arr,int i,int j){
        //right
        for(int p=j+1;p<arr[0].length;p++){
            if(arr[i][p]!=1 && arr[i][p]!=2) arr[i][p]=3;
            else break;
        }

        //left;
        for(int p=j-1;p>=0;p--){
            if(arr[i][p]!=1 && arr[i][p]!=2) arr[i][p]=3;
            else break;
        }

        //top
        for(int p=i-1;p>=0;p--){
            if(arr[p][j]!=1 && arr[p][j]!=2) arr[p][j]=3;
            else break;
        }

        //down
        for(int p=i+1;p<arr.length;p++){
            if(arr[p][j]!=1 && arr[p][j]!=2) arr[p][j]=3;
            else break;
        }
    }
}