class Solution {
    public int largestMagicSquare(int[][] arr) {
        int c=arr[0].length;
        int r=arr.length;
        int max=Math.min(r,c);
        for(int i=max;i>1;i--){
            if(ispos(arr,i)) return i;
        }
        return 1;
    }

    public boolean ispos(int[][]arr,int max){
        for(int i=0;i<arr.length-max+1;i++){
            for(int j=0;j<arr[0].length-max+1;j++){
                if(all(i,j,i+max,j+max,arr)) return true;
            }
        }
        return false;
    }

    public boolean all(int r1, int c1, int r2, int c2, int[][] grid) {
    int target = 0;

    // first row sum
    for (int j = c1; j < c2; j++) {
        target += grid[r1][j];
    }

    // check all rows
    for (int i = r1; i < r2; i++) {
        int sum = 0;
        for (int j = c1; j < c2; j++) {
            sum += grid[i][j];
        }
        if (sum != target) return false;
    }

    // check all columns
    for (int j = c1; j < c2; j++) {
        int sum = 0;
        for (int i = r1; i < r2; i++) {
            sum += grid[i][j];
        }
        if (sum != target) return false;
    }

    // main diagonal
    int diag1 = 0;
    for (int i = 0; i < r2 - r1; i++) {
        diag1 += grid[r1 + i][c1 + i];
    }
    if (diag1 != target) return false;

    // anti-diagonal
    int diag2 = 0;
    for (int i = 0; i < r2 - r1; i++) {
        diag2 += grid[r1 + i][c2 - 1 - i];
    }
    if (diag2 != target) return false;

    return true;
}

}