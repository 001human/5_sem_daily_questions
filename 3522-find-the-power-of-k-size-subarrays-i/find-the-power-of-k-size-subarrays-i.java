class Solution {
    public int[] resultsArray(int[] arr, int k) {
        int n=arr.length;
        int[]ans=new int[n-k+1];
        for(int i=0;i<k-1;i++){
            if(arr[i]+1!=arr[i+1]){
                    ans[0]=-1;
                    break;
                }
        }

        int r=k;
        int l=1;
        if(ans[0]!=-1) ans[0]=arr[k-1];
        while(r<arr.length ){
            for(int i=l;i<r;i++){
                if(arr[i]+1!=arr[i+1]){
                    ans[l]=-1;
                    break;
                }
            }
            if(ans[l]!=-1) ans[l]=arr[r];
            r++;
            l++;
        }
        return ans;
    }
}