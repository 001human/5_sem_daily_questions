class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<j){
            ans=Math.max(ans,arr[i++]+arr[j--]);
        }
        return ans;
    }
}