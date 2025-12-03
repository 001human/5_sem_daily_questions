class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int[]pre=new int[n];
        int[]suf=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=Math.max(pre[i-1],arr[i]);
        }
        suf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(arr[i],suf[i+1]);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=Math.min(suf[i],pre[i])-arr[i];
        }
        return ans;
    }
}