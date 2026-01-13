class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int[]suf=new int[n];
        suf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(arr[i],suf[i+1]);
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans=Math.max(ans,suf[i+1]-arr[i]);
        }
        return ans;
    }
}