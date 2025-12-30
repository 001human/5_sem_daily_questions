class Solution {
    public int numMagicSquaresInside(int[][] arr) {
        int ans=0;
        for(int i=0;i<=arr.length-3;i++){
            for(int j=0;j<=arr[0].length-3;j++){
                if(fun(i,j,arr)) ans++;
            }
        }
        return ans;
    }

    public boolean fun(int r,int c,int[][]grid){
        int r_=r+3;
        int c_=c+3;
        HashSet<Integer>set=new HashSet<>();
        for(int p=r;p<r_;p++){
            for(int q=c;q<c_;q++){
                if(grid[p][q]<=9 && grid[p][q]>=1 ) set.add(grid[p][q]);
            }
        }
        if(set.size()!=9) return false;
        int r1 = grid[r][c] + grid[r][c + 1] + grid[r][c + 2];
        int r2 = grid[r + 1][c] + grid[r + 1][c + 1] + grid[r + 1][c + 2];
        int r3 = grid[r + 2][c] + grid[r + 2][c + 1] + grid[r + 2][c + 2];
        int c1 = grid[r][c] + grid[r + 1][c] + grid[r + 2][c];
        int c2 = grid[r][c + 1] + grid[r + 1][c + 1] + grid[r + 2][c + 1];
        int c3 = grid[r][c + 2] + grid[r + 1][c + 2] + grid[r + 2][c + 2];
        int d1 = grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2];
        int d2 = grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c];
        if (r1 == r2 && r2 == r3 && r3 == c1 && c1 == c2 && c2 == c3 && c3 == d1 && d1 == d2) return true;
        return false;
    }
}