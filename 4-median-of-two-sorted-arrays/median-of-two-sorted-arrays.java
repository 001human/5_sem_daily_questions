class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;
        int[]ans=new int[m+n];
        int ind=0;
        for(int i=0;i<m;i++){
            ans[ind++]=arr1[i];
        }
        for(int i=0;i<n;i++){
            ans[ind++]=arr2[i];
        }
        double y=0;
        Arrays.sort(ans);
        int x=ans.length;
        if((x%2)==1){
            int r=(x+1)/2; 
            y=ans[r-1];
        }
        else{
            int r=(x)/2; 
            // int w=(x)/2+1;
            y=(ans[r]+ans[r-1])/2.0;
        }

        return y;
    }
}
