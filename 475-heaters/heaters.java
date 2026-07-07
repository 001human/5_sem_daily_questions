class Solution {
    public int findRadius(int[] arr, int[] heat) {
        Arrays.sort(arr);
        Arrays.sort(heat);
        long start=0;
        long end=arr[arr.length-1];
        end=Math.max(end,heat[heat.length-1]);
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(ispos(arr,heat,mid)){
                ans=Math.min(ans,(int)mid);
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }

    public boolean ispos(int[]arr,int[]heat,long r){
        long s=0;
        int[]temp=new int[arr.length];
        int j=0;
        for(int i=0;i<heat.length;i++){
            long st=heat[i]-r;
            long end=heat[i]+r;
            while(j<arr.length && arr[j]>=st && arr[j]<=end ){
                temp[j]=-1;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(temp[i]==-1) s++;
        }
        if(s==arr.length) return true;
        return false;
    }
}