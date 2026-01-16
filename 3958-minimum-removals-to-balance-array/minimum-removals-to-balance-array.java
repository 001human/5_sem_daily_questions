class Solution {
    public int minRemoval(int[] arr, int k) {
        Arrays.sort(arr);
        int ans=0;
        int left=0;
        int right=0;
        while(right<arr.length){
            while(arr[right]>1L*arr[left]*k){
                left++;
            }
            if(arr[right]<=1L*arr[left]*k){
                ans=Math.max(ans,right-left+1);
            }
            right++;
        }
        return arr.length-ans;
    }
}