class Solution {
    public boolean escapeGhosts(int[][] arr, int[] t) {
        int dist=Math.abs(t[0])+Math.abs(t[1]);
        for(int i=0;i<arr.length;i++){
            int x=Math.abs(arr[i][0]-t[0]);
            int y=Math.abs(arr[i][1]-t[1]);
            if( x+y<=dist ) return false;
        }
        return true;
    }
}