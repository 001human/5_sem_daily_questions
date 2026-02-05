class Solution {
    public int[] getSubarrayBeauty(int[] arr, int k, int x) {
        int n=arr.length;
        int[]ans=new int[n-k+1]; 
        int idx=0;
        int r=0;
        int l=0;
        int[]fre=new int[51];
        while(r<n){
            if(r-l+1>k){
                if(arr[l]<0) fre[Math.abs(arr[l])]--;
                l++;
            }
            if(arr[r]<0) fre[Math.abs(arr[r])]++;
            if(r-l+1==k){
                int cur=0;
                int temp=0;
                for(int i=fre.length-1;i>0;i--){
                    if(cur+fre[i]>=x ){
                        temp=i;
                        break;
                    }
                    cur+=fre[i];
                }
                ans[idx++]=-1*temp;
            }
            r++;
        }
        return ans;  
    }
}