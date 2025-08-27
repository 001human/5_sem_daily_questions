class Solution {
    public int minimumAverageDifference(int[] arr) {
        int n=arr.length;
        long[]pre=new long[n];
        pre[0]=arr[0];
        long sum=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
            sum+=arr[i];
        }

        int ans=-1;
        long tmp=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            long a=pre[(int)i]/(i+1);
            long b=0;
            if(n-(i+1)!=0) b=(sum-pre[i])/(n-(i+1));
            if(Math.abs(a-b)<tmp) {
                tmp=Math.abs(a-b);
                ans=i;
                }
        }
        return ans;
    }
}