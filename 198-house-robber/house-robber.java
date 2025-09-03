class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return fun(dp,arr,n-1);
    }

    public int fun(int[]dp,int[]arr,int i){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob=arr[i]+fun(dp,arr,i-2);
        int norob=fun(dp,arr,i-1);
        dp[i]=Math.max(rob,norob);
        return dp[i];
    }
}




//recursive  td1

// class Solution {
//     public int rob(int[] arr) {
//         int n=arr.length;
//         int[]dp=new int[n];
//         Arrays.fill(dp,-1);
//         return fun(dp,arr,0);
//     }

//     public int fun(int[]dp,int[]arr,int i){
//         if(i>=arr.length) return 0;
//         if(dp[i]!=-1) return dp[i];
//         int rob=arr[i]+fun(dp,arr,i+2);
//         int norob=fun(dp,arr,i+1);
//         dp[i]=Math.max(rob,norob);
//         return dp[i];
//     }
// }