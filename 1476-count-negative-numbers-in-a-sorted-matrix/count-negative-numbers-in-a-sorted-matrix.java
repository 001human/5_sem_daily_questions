class Solution {
    public int countNegatives(int[][] arr) {
        int n=arr[0].length-1;
        int r=arr.length-1;
        int c=0;
        int count=0;
        while(r>=0 && c<=n){
            if(arr[r][c]<0){
                count+=(n-c+1);
                r--;    
            }
            else{
                c++;
            }
        }
        return count;
    }
}
