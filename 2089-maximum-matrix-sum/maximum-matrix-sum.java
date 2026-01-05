class Solution {
    public long maxMatrixSum(int[][] arr) {
        long ans=0;
        int n=0;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                ans+=Math.abs(arr[i][j]);
                min=Math.min(min,Math.abs(arr[i][j]));
                if(arr[i][j]<0) n++;
            }
        }
        if(n%2==0) return ans;
        return ans-2*min;
    }
}