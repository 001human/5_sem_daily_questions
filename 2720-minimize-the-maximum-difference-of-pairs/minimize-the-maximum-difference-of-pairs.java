class Solution {
    public int minimizeMax(int[] arr, int p) {
        Arrays.sort(arr);
        int start=0;
        int ans=0;
        int end=arr[arr.length-1]-arr[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ispos(mid,arr,p)){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }

    public boolean ispos(int dif,int[]arr,int p){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])<=dif) {
                p--;
                i++;
            }
            if(p==0) return true;
        }
        return false;
    }
}