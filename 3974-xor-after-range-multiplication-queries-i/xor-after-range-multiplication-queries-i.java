class Solution {
    public int xorAfterQueries(int[] arr, int[][] q) {
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            int k=q[i][2];
            int v=q[i][3];
            for(int idx=l;idx<=r;idx+=k){
                arr[idx]=(int) (( 1L*arr[idx]*v ) % (1000_000_000 + 7));
            }
        }
        int ans=0;
        for(int n:arr){
            ans^=n;
        }
        return ans;
    }
}