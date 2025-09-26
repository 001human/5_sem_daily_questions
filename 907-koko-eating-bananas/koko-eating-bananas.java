class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        long start=1;
        long end=0;
        for(int i=0;i<arr.length;i++){
            end=Math.max(end,arr[i]);
        }
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(pos(mid,arr)<=h){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return (int)ans;
    }

    public long pos(long mid,int []arr){
        long c=0;
        for(int i=0;i<arr.length;i++){
            c+=arr[i]/mid;
            if(arr[i]%mid!=0) c++;
        }
        return c;
    }
}