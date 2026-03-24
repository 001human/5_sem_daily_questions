class Solution {
    static int ans;
    public int findTargetSumWays(int[] arr, int t) {
        ans=0;
        fun(arr,t,0,0);
        return ans;
    }

    public void fun(int[]arr,int t,int sum,int i){
        if(i==arr.length && sum==t){
            ans++;
            return;
        }
        if(i>=arr.length) return;
        fun(arr,t,sum+arr[i],i+1);
        fun(arr,t,sum-arr[i],i+1);
    }
}