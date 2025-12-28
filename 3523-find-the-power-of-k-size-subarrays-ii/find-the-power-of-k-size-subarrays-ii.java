class Solution {
    public int[] resultsArray(int[] arr, int k) {
        int n=arr.length;
        int []pre=new int[n];
        pre[0]=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]+1) pre[i]=pre[i-1]+1;
            else pre[i]=1;
        }
        int ind=0;
        int[]ans=new int[n-k+1];
        for(int i=k-1;i<n;i++){
            if(pre[i]>=k) ans[ind]=arr[i];
            else ans[ind]=-1;
            ind++;
        }
        return ans;
    }
}