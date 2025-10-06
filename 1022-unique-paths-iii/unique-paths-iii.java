class Solution {
    int total=0;
    public int uniquePathsIII(int[][] arr) {
        int cr=0;
        int cc=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    cr=i;
                    cc=j;
                }
                else if(arr[i][j]==0) total++;
            }
        }
        return fun(cr,cc,arr,arr.length,arr[0].length,0);
    }

    public int fun(int cr,int cc,int[][]arr,int r,int c,int count){
        if(cr>=r || cr<0 || cc>=c || cc<0 || arr[cr][cc]==-1) return 0;
        if(arr[cr][cc]==2 && total==count-1){
            return 1;
        }
        int t=arr[cr][cc];
        arr[cr][cc]=-1;
        int ans=fun(cr+1,cc,arr,r,c,count+1) + fun(cr-1,cc,arr,r,c,count+1) + fun(cr,cc+1,arr,r,c,count+1) + fun(cr,cc-1,arr,r,c,count+1);
        arr[cr][cc]=t;
        return ans;
    }
}
