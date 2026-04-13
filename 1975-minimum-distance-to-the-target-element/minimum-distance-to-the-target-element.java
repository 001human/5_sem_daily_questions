class Solution {
    public int getMinDistance(int[] arr, int t, int start) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                ans=Math.min(ans,Math.abs(i-start));
            }
        }
        return ans;
    }
}