class Solution {
    public int maxSubArray(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=Math.max(arr[i],arr[i]+arr[i-1]);
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}