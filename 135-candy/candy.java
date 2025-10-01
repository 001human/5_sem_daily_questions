class Solution {
    public int candy(int[] arr) {
        int n=arr.length;
        int[]pre=new int[n];
        int[]suf=new int[n];
        Arrays.fill(pre,1);
        Arrays.fill(suf,1);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]) pre[i]=pre[i-1]+1;
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]) suf[i]=suf[i+1]+1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.max(pre[i],suf[i]);
        }
        return ans;
    }
}