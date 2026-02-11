class Solution {
    public int minSwaps(int[] arr) {

        //for total ones we find which window has least ones and that will be swapped 
        int ans=Integer.MAX_VALUE;
        int zero=0;
        int r=0;
        int l=0;
        int n=0;
        for(int a:arr){
            if(a==1) n++;
        }
        while(r<2*arr.length-1){
            if(r-l+1>n) {
                if(arr[l%arr.length]==0) zero--;
                l++;
            }
            if(arr[r%arr.length]==0) zero++;
            if(r-l+1==n){
                ans=Math.min(ans,zero);
            }
            r++;
        }
        return ans;
    }
}