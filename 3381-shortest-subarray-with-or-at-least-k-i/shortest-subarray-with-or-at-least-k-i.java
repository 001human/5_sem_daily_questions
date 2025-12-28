class Solution {
    public int minimumSubarrayLength(int[] arr, int k) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int t=0;
            for(int j=i;j<arr.length;j++){
                t=t|arr[j];
                if(t>=k){
                    if((j-i+1)<ans) ans=Math.min(ans,(j-i+1));
                }
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}