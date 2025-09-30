class Solution {
    public int longestOnes(int[] arr, int k) {
        int ans=0;
        int left=0;
        int right=0;
        int c=0;
        while(right<arr.length){
            if(arr[right]==0) c++;
            while(c>k){
                if(arr[left]==0) c--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}