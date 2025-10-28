class Solution {
    public int maxProduct(int[] arr) {
        int[]pre=new int[arr.length];
        int[]suf=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(pre[i-1]!=0) pre[i]=pre[i-1]*arr[i];
            else pre[i]=arr[i];
        }
        suf[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(suf[i+1]!=0) suf[i]=suf[i+1]*arr[i];
            else suf[i]=arr[i];
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,Math.max(pre[i],suf[i]));
        }
        return ans;
    }
}