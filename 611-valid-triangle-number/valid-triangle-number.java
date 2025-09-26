class Solution {
    public int triangleNumber(int[] arr) {
        int ans=0;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
            int th=arr[i];
            int start=0;
            int end=i-1;
            while(start<end){
                if(arr[start]+arr[end]>th){
                    ans+=end-start;
                    end--;
                }
                else start++;
            }
        }
        return ans;
    }
}