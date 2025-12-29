class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left+1<arr.length && arr[left]<=arr[left+1]) left++;
        if(left==arr.length-1) return 0;
        while(right>0 && arr[right]>=arr[right-1]) right--;
        int ans=Math.min(right,arr.length-left-1);
        int i=0;
        while(i<=left && right<arr.length){
            if(arr[i]<=arr[right]){
                ans=Math.min(ans,right-i-1);
                i++;
            }
            else right++;
        }
        return ans;
    }
}