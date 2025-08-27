class Solution {
    public int waysToSplitArray(int[] arr) {
        int n=arr.length;
        long[]pre=new long[n];
        pre[0]=arr[0];
        long s=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
            s+=arr[i];
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            if(pre[i]>=(s-pre[i])) ans++;
        }
        return ans;
    }
}