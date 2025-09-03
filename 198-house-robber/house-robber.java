//bottom to top

class Solution {
    public int rob(int[] arr) {
        int []dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return fun(arr,arr.length-1,dp);
    }
        public int fun(int[]arr,int i,int[]dp){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        //rob and notrob
        dp[i]=Math.max( arr[i]+fun(arr,i-2,dp), fun(arr,i-1,dp));
        return dp[i];
    }

}



//top to down

// class Solution {
//     public int rob(int[] arr) {
//         int []dp=new int[arr.length];
//         Arrays.fill(dp,-1);
//         return fun(arr,0,dp);
//     }

//     public int fun(int[]arr,int i,int[]dp){
//         if(i>=arr.length) return 0;
//         if(dp[i]!=-1) return dp[i];
//         //rob and notrob
//         dp[i]=Math.max( arr[i]+fun(arr,i+2,dp), fun(arr,i+1,dp));
//         return dp[i];
//     }
// }