class Solution {
    public int minimumArea(int[][] arr) {
        int rmin=Integer.MAX_VALUE;
        int rmax=-1;
        int cmin=Integer.MAX_VALUE;
        int cmax=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    rmin=Math.min(rmin,i);
                    rmax=Math.max(rmax,i);
                    cmax=Math.max(cmax,j);
                    cmin=Math.min(cmin,j);
                }
            }
        }
        return (rmax-rmin+1)*(cmax-cmin+1);
    }
}