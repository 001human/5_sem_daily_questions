class Solution {
    public int maximumEnergy(int[] arr, int k) {
        int[]dp=new int[arr.length+1];
        Arrays.fill(dp,-1001);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,fun(arr,k,i,dp));
        }
        return ans;
    }

    public int fun(int[]arr,int k,int i,int[]dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1001) return dp[i];
        return dp[i]=arr[i]+fun(arr,k,i+k,dp);
    }
}