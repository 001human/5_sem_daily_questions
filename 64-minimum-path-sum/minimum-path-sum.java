class Solution {
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length][grid[0].length];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return fun(grid,dp,0,0);
    }
    public int fun(int[][]grid,int[][]dp,int cr,int cc){
        if(cr==grid.length-1 && cc==grid[0].length-1) return grid[cr][cc];
        if(cr==grid.length || cc==grid[0].length) return Integer.MAX_VALUE;
        if(dp[cr][cc]!=-1) return dp[cr][cc];
        int right=fun(grid,dp,cr,cc+1);
        int left=fun(grid,dp,cr+1,cc);
        dp[cr][cc]=Math.min(right,left)+grid[cr][cc];
        return dp[cr][cc];
    }
}