class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            ans+=( ((i+1)*(n-i)+1)/2 )*arr[i];
        }
        return ans;
    }
}