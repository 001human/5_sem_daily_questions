class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int[]ans=new int[n];
        int max=1;
        Arrays.fill(ans,1);
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    ans[i]=Math.max(ans[i],ans[j]+1);
                }
                 max=Math.max(max,ans[i]);
            }
        }
        return max;
    }
}