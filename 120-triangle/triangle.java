class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int r=t.size();
        int[][]arr=new int[r][r];
        for(int[]a:arr){
            Arrays.fill(a,Integer.MAX_VALUE/2);
        }

        for(int i=0;i<t.size();i++){
            for(int j=0;j<t.get(i).size();j++){
                arr[i][j]=t.get(i).get(j);
            }
        }

        int[][]dp=new int[arr.length][arr.length];
        for(int[]a:dp){
            Arrays.fill(a,Integer.MAX_VALUE/2);
        }

        return fun(arr,0,0,dp);
    }

    public int fun(int [][]arr,int i,int j,int[][]dp){
        if(i==arr.length-1 && j<=arr.length-1 && j>=0){
            return arr[i][j];
        }
        if(i<0 || i>=arr.length || j<0 || j>=arr.length || arr[i][j]==Integer.MAX_VALUE/2) return Integer.MAX_VALUE/2;
        if(dp[i][j]!=Integer.MAX_VALUE/2) return dp[i][j];
        //2 calls
        int a = arr[i][j] + fun(arr,i+1,j,dp);
        int c = arr[i][j] + fun(arr,i+1,j+1,dp); 
        return dp[i][j]=Math.min(a,c);
    }
}