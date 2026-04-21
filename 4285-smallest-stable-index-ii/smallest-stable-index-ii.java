class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n=arr.length;
        int[]pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],arr[i]);
        }
        int[]suf=new int[n];
        suf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.min(suf[i+1],arr[i]);
        }
        for(int i=0;i<n;i++){
            if(pre[i]-suf[i]<=k) return i;
        }
        return -1;
    }
}