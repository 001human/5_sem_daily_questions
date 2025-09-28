class Solution {
    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr);
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(arr[i]+arr[i+1]>arr[i+2]){
                ans=Math.max(ans,arr[i]+arr[i+1]+arr[i+2]);
            }
        }
        return ans;
    }
}