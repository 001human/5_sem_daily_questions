class Solution {
    public int rob(int[] arr) {
        //tabulation
        int n=arr.length;
        int[]dp=new int[n];
        if(n==1) return arr[0];
        else if(n==2) return Math.max(arr[0],arr[1]);
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}




// class Solution {
//     //memoization
//     public int rob(int[] arr) {
//         int n=arr.length;
//         int[]dp=new int[n];
//         Arrays.fill(dp,-1);
//         return fun(arr,dp,0);
//     }

//     public int fun(int[]arr,int[]dp,int i){
//         if(i>=arr.length) return 0;
//         if(dp[i]!=-1) return dp[i];
//         int rob=arr[i]+fun(arr,dp,i+2);
//         int np=fun(arr,dp,i+1);
//         return dp[i]=Math.max(rob,np);
//     }
// }