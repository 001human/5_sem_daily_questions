class Solution {
    public int subarraySum(int[] arr, int k) {
        int n=arr.length;
        int[]pre=new int[n+1];
        int ans=0;
        pre[0]=0;
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+arr[i-1];
        }
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(pre[j]-pre[i]==k) ans++;
            }
        }
        return ans;
    }
}