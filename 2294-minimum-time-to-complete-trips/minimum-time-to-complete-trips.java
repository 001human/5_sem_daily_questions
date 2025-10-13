class Solution {
    public long minimumTime(int[] arr, int t) {
        long start=1;
        long end=Long.MAX_VALUE;
        long ans=Long.MAX_VALUE;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(pos(arr,mid,t)){
                ans=Math.min(ans,mid);
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }

    public boolean pos(int []arr,long mid,int t){
        long ans=0;
        for(int i=0;i<arr.length;i++){
           long x=(mid/arr[i]);
           ans+=x;
           if(ans>=t) return true;
        }
        return ans>=t;
    }
}