class Solution {
    public long countSubarrays(int[] arr, long k) {
        long ans=0;
        long sum=0;
        int r=0;
        int l=0;
        while(r<arr.length){
            sum+=arr[r]+0L;
            while(sum*1L*(r-l+1)>=k){
                sum-=arr[l];
                l++;
            }
            ans+=(r-l+1);
            r++;
            
        }
        return ans;
    }
}