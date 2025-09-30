class Solution {
    public int numIslands(char[][] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='1') {
                    find(arr,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void find(char[][]arr,int i,int j){
        if(i <0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] != '1') return;
        arr[i][j] = '0';
        find(arr , i-1 , j);
        find(arr , i+1 , j);
        find(arr , i , j-1);
        find(arr , i , j+1);
    }
}