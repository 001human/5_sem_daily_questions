class Solution {
    public int maxWidthRamp(int[] arr) {
        int n=arr.length;
        int[]suf=new int[n];
        suf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],arr[i]);
        }

        int ans=0;
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            int t=0;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(suf[mid]>=arr[i]){
                    t=mid;
                    start=mid+1;
                }
                else end=mid-1;
            }
            ans=Math.max(ans,t-i);
        }
        return ans;
    }
}