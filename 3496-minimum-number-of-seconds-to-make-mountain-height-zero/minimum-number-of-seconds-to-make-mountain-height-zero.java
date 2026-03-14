class Solution {
    public long minNumberOfSeconds(int h, int[] arr) {
        //number to height
        //2*(1+2+3+4)=20
        //3*(1+2)=9
        //binary search
        long start=1;
        long end = 1_000_000_000_000_000_0L; 
        long ans=Integer.MAX_VALUE;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(ispos(mid,h,arr)){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }

    public boolean ispos(long mid,int h,int[]arr){
        long ans=0;
        for(int i=0;i<arr.length;i++){
            long x=mid/arr[i];
            ans+= (long)((Math.sqrt(1 + 8*x) - 1) / 2);
            //ans+=n;
        }
        return ans>=h;
    }
}