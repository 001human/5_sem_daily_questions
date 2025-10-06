class Solution {
    public int threeSumClosest(int[] arr, int t) {
        Arrays.sort(arr);
        int ans=arr[0]+arr[1]+arr[2];
        for(int i=0;i<arr.length-2;i++){
            int start=i+1;
            int end=arr.length-1;
            while(start<end){
                int sum=arr[i]+arr[start]+arr[end];
                if(Math.abs(sum-t)<Math.abs(ans-t)){
                    ans=sum;
                }
                else if(sum==t) return t;
                else if(sum>t) end--;
                else start++;
            }
        }
        return ans;
    }
}