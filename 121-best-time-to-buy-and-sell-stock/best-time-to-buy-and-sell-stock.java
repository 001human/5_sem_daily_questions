class Solution {
    public int maxProfit(int[] arr) {
        int start=0;
        int end=0;
        int ans=0;
        while(end<arr.length){
            if(arr[end]>arr[start]) ans=Math.max(ans,arr[end]-arr[start]);
            else start=end;
            end++;
        }
        return ans;
    }
}