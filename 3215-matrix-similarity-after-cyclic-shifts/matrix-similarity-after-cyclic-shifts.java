class Solution {
    public boolean areSimilar(int[][] arr, int k) {
        int r=arr.length;
        int c=arr[0].length;
        k=k%c;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]!=arr[i][(j+k)%c]) return false;
            }
        }
        return true;
    }
}