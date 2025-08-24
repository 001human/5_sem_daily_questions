class Solution {
    public int longestSubarray(int[] arr) {
        int end=0;
        int start=0;
        int ans=0;
        int zero=0;
        while(end<arr.length){
            if(arr[end]==0) zero++;

            while(zero>1){
                if(arr[start]==0) zero--;
                start++;
            }

            ans=Math.max(ans,end-start+1);
            end++;
        }
        ans=ans-1;
        if(ans<0) return 0;
        return ans;

    }
}