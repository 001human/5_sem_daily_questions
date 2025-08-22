class Solution {
    public int minimumArea(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int minX=Integer.MAX_VALUE;
        int minY=Integer.MAX_VALUE;
        int maxX=0;
        int maxY=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    minX=Math.min(minX,i);
                    maxX=Math.max(maxX,i);
                    minY=Math.min(minY,j);
                    maxY=Math.max(maxY,j);
                }
            }
        }
        return (maxX-minX+1)*(maxY-minY+1);
    }
}



