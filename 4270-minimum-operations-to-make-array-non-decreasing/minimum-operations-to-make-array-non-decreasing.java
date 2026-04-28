class Solution {
    public long minOperations(int[] arr) {
        long ans=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                ans+=arr[i-1]-arr[i];
            }
        }
        return ans;
    }
}