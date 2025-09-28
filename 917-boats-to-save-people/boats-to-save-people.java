class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        int ans=0;
        while(start<=end){
            if(arr[end]+arr[start]<=limit){
                ans++;
                end--;
                start++;
            }
            else if(arr[end]<=limit){
                ans++;
                end--;
            }
        }
        return ans;
    }
}