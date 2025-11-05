class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        int[][]dp=new int[arr.size()][arr.size()];
        for(int[]ar:dp){
            Arrays.fill(ar,Integer.MAX_VALUE);
        }
        return fun(arr,0,0,dp);
    }

    public int fun(List<List<Integer>> arr,int r,int c,int[][]dp){
        if(r==arr.size()-1 ){
            return arr.get(r).get(c);
        }
        if(r>=arr.size() || c>=arr.get(r).size() ) return Integer.MAX_VALUE;
        if(dp[r][c]!=Integer.MAX_VALUE) return dp[r][c];
        int a=fun(arr,r+1,c,dp);
        int b=fun(arr,r+1,c+1,dp);
        return dp[r][c]=Math.min(a,b)+arr.get(r).get(c);
    }
}