class Solution {
    public int minCost(int n, int[] arr) {
        Arrays.sort(arr);
        int[][]dp=new int[arr.length][arr.length];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return fun(0,n,arr,0,arr.length-1,dp);
    }

    public int fun(int start_len,int end_len,int[]arr,int left,int right,int[][]dp){
        if(left>right) return 0;
        if(dp[left][right]!=-1) return dp[left][right];
        int ans=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            int left_cost=fun(start_len,arr[i],arr,left,i-1,dp);
            int right_cost=fun(arr[i],end_len,arr,i+1,right,dp);
            int cur_cost=(end_len-start_len) + left_cost + right_cost;
            ans=Math.min(ans,cur_cost);
        }
        return dp[left][right] = ans;
    }
}