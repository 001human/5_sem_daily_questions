class Solution {
    static int fl;
    public int countSubIslands(int[][] arr1, int[][] arr2) {
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                fl=0;
                if(arr2[i][j]==1){
                    fun(arr1,arr2,i,j);
                    if(fl==0) ans++;
                }
            }
        }
        return ans;
    }

    public void fun(int[][]arr1,int[][]arr2,int i,int j){
        if(i>=arr1.length || j>=arr1[0].length || i<0 || j<0 || arr2[i][j]!=1) return;
        if(arr1[i][j]!=arr2[i][j] ) fl=1;
        arr2[i][j]=0;
        fun(arr1,arr2,i+1,j);
        fun(arr1,arr2,i-1,j);
        fun(arr1,arr2,i,j+1);
        fun(arr1,arr2,i,j-1);
    }
}