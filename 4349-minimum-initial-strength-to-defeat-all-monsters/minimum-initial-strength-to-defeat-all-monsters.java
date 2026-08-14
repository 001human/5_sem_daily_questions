class Solution {
    public long minInitialStrength(int[] arr, int[][] b) {
        long start=0;
        long end=0;
        for(int i=0;i<arr.length;i++){
            end+=arr[i];
        }

        long[]p=new long[arr.length+1];
        for(int i=0;i<b.length;i++){
            int r=b[i][0];
            int l=b[i][1];
            int v=b[i][2];
            p[r]+=v;
            p[l+1]-=v;
        }

        for(int i=1;i<p.length;i++){
            p[i]=p[i]+p[i-1];
        }

        long ans=end;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(fun(mid,arr,p)){
                ans=Math.min(ans,mid);
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    public boolean fun(long t,int[]m,long[]arr){
        for(int i=0;i<m.length;i++){
            if(t+arr[i]<m[i]) return false;
            t-=m[i];
            if(t<0) t=0;
        }
        return true;
    }
}