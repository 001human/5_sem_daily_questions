class Solution {
    public long minOperations(int[] arr1, int[] arr2) {
        int fd=-1;
        int min=Integer.MAX_VALUE;
        int n=arr1.length;
        for(int i=0;i<n;i++){
            if(Math.abs(arr2[n]-arr2[i])<min){
                min=Math.abs(arr2[n]-arr2[i]);
                fd=i;
            }
        }

        int flag=0;
        for(int i=0;i<n;i++){
            if(Math.abs(arr2[n]-arr1[i])<min){
                min=Math.abs(arr2[n]-arr1[i]);
                fd=i;
                flag=1;
            }
        }

        long ans=Long.MAX_VALUE;
        if(flag==1){
            long t=0;
            t+=Math.abs(arr2[n]-arr1[fd])+1;
            for(int i=0;i<n;i++){
                t+=Math.abs(arr1[i]-arr2[i]);
            }
            ans=Math.min(t,ans);
        }

        else{
            long t=0;
            t+=Math.abs(arr2[fd]-arr1[fd])+Math.abs(arr2[n]-arr2[fd])+1;
            int temp=arr1[fd];
            arr1[fd]=arr2[fd];
            for(int i=0;i<n;i++){
                t+=Math.abs(arr1[i]-arr2[i]);
            }
            arr1[fd]=temp;
            ans=Math.min(t,ans);
        }

        int test=0;
        for(int i=0;i<n;i++){
            if( (arr2[n]>=arr2[i] && arr2[n]<=arr1[i]) || (arr2[n]<=arr2[i] && arr2[n]>=arr1[i]) ) {
                test=1;
                break;
            }
        }

        if(test==1){
            long t=1;
            for(int i=0;i<n;i++){
                t+=Math.abs(arr1[i]-arr2[i]);
            }
            ans=Math.min(t,ans);
        }

        return ans;
    }
}