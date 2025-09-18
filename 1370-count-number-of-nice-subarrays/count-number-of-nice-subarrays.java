class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        return fun(arr,k)-fun(arr,k-1);
    }

    public int fun(int []arr,int k){
        int l=0;
        int r=0;
        int ans=0;
        int c=0;
        while(r<arr.length){
            if(arr[r]%2==1) c++;
            while(c>k){
                if(arr[l]%2==1) c--;
                l++;
            }
            ans+=(r-l+1);
            r++;
        }
        return ans;
    }
}
