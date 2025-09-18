class Solution {
    public int longestOnes(int[] arr, int k) {
        int r=0;
        int l=0;
        int ans=0;
        int c=0;
        while(r<arr.length){
            if(arr[r]==0) c++;
            while(c>k){
                if(arr[l]==0) c--;
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        if(r==arr.length) r--;
        ans=Math.max(ans,(r-l+1));
        return ans;
    }
}