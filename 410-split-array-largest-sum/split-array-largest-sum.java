class Solution {
    public int splitArray(int[] arr, int k) {
        int start=0,end=0,ans=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(ispos(mid,arr)<=k){
            ans=mid;
            end=mid-1;
            }
            else start=mid+1;

        }
        return ans;
    }

    public int ispos(int mid,int[]arr){
        int c=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                c++;
                sum=arr[i];
            }
        }
        return c;
    }
}