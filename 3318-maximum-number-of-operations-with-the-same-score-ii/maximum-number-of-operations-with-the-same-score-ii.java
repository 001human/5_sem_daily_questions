class Solution {
    int[][]dp;
    public int maxOperations(int[] arr) {
        //we have 3 options ans for each size should be min of 2
        int n=arr.length;
        dp=new int[n][n];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        int ans=0;
        int a=fun(arr,2,n-1,arr[0]+arr[1]);
        for(int []a1:dp){
            Arrays.fill(a1,-1);
        }
        int b=fun(arr,0,n-3,arr[n-1]+arr[n-2]);
        for(int []a1:dp){
            Arrays.fill(a1,-1);
        }
        int c=fun(arr,1,n-2,arr[n-1]+arr[0]);
        int a1=Math.max(a,b);
        return Math.max(a1,c)+1;
    }

    public int fun(int[]nums,int i,int j,int sum){
        if(i >= j) {
            return 0;
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans=0;
        if(nums[i] + nums[i+1] == sum) {
            int a = 1 + fun(nums, i+2, j, sum);
            ans = Math.max(ans, a);
        }
        if(nums[j]+nums[j-1] == sum) {
            int a = 1 + fun(nums, i, j-2, sum);
            ans = Math.max(ans, a);
        }
        if(nums[i]+nums[j] == sum) {
            int a = 1 + fun(nums, i+1, j-1, sum);
            ans = Math.max(ans, a);
        }
        return dp[i][j] = ans;
    }
}