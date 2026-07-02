class Solution {
    public boolean findSafeWalk(List<List<Integer>> arr, int h) {
        int r=arr.size();
        int c=arr.get(0).size();
        int[][]visit=new int[r][c];
        Boolean[][][]dp=new Boolean[r][c][h+1];
        return fun(arr,h,0,0,visit,dp);
    }

    public boolean fun(List<List<Integer>> arr, int h,int r,int c,int[][]visit,Boolean[][][]dp){
        if(r==arr.size()-1 && c==arr.get(0).size()-1){
            if(arr.get(r).get(c)==1) h--;
            if(h>=1) return true;
            return false;
        }

        if(r<0 || c<0 || r>=arr.size() || c>=arr.get(0).size() || visit[r][c]==1 ) return false; 
        if(arr.get(r).get(c)==1) h--;
        if(h<=0) return false;
        if(dp[r][c][h]!=null) return dp[r][c][h];
        
        visit[r][c]=1;
        boolean b1=fun(arr,h,r+1,c,visit,dp);
        boolean b2=fun(arr,h,r-1,c,visit,dp);
        boolean b3=fun(arr,h,r,c-1,visit,dp);
        boolean b4=fun(arr,h,r,c+1,visit,dp);
        visit[r][c]=0;
        return dp[r][c][h] = b1 || b2 || b3 || b4;
    }
}