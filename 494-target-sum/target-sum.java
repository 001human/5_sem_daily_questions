class Solution {
    static int ans;
    public int findTargetSumWays(int[] arr, int t) {
        ans=0;
        fun(arr,t,0);
        return ans;
    }

    public void fun(int[]arr,int t,int i){
        if(i==arr.length && t==0){
            ans++;
            return;
        }
        if(i>=arr.length) return;
        fun(arr,t+arr[i],i+1);
        fun(arr,t-arr[i],i+1);
    }
}