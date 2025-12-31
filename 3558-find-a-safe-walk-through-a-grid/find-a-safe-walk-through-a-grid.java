class Solution {
    public boolean findSafeWalk(List<List<Integer>> arr, int h) {
        int[][]visit=new int[arr.size()][arr.get(0).size()];
        int[][][]dp=new int[arr.size()][arr.get(0).size()][h+1];
        for(int[][]a:dp){
            for(int[]ar:a){
                Arrays.fill(ar,-1);
            }
        }
        return fun(arr,h,0,0,visit,dp);
    }

    public boolean fun(List<List<Integer>> arr, int h,int i,int j,int[][]visit,int[][][]dp){
        if(i>=arr.size() || i<0 || j<0 || j>=arr.get(0).size() || visit[i][j]==1) return false;
        if(arr.get(i).get(j)==1) h--;
        if(h<1) return false;
        if(i==arr.size()-1 && j==arr.get(0).size()-1 ){
            return true;
        }
        if(dp[i][j][h]!=-1) return dp[i][j][h]==1;
        visit[i][j]=1;
        boolean up;
        boolean down;
        boolean right;
        boolean left;
        up=fun(arr,h,i-1,j,visit,dp);
        down=fun(arr,h,i+1,j,visit,dp);
        right=fun(arr,h,i,j+1,visit,dp);
        left=fun(arr,h,i,j-1,visit,dp);
        visit[i][j]=0;
        boolean r=up || down || right || left;
        dp[i][j][h]= r ? 1:0;
        return r; 
    }
}