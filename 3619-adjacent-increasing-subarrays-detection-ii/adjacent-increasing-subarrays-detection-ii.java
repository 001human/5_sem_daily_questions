
class Solution {
    public int maxIncreasingSubarrays(List<Integer> arr) {
        int[]pre=new int[arr.size()];
        int n=arr.size();
        pre[0]=1;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)<arr.get(i)){
                pre[i]=pre[i-1]+1;
            }
            else {
                pre[i]=1;
            }
        }

        int[]suf=new int[n];
        suf[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(arr.get(i+1)>arr.get(i)){
                suf[i]=suf[i+1]+1;
            }
            else suf[i]=1;
        }

        int ans=0;
        for(int i=0;i<n-1;i++){
            int m=Math.min(pre[i],suf[i+1]);
            ans=Math.max(ans,m);
        }
        return ans;
    }
}
