class Solution {
    public void solveSudoku(char[][] board) {
        if(board.length==0) return ;
        print(board,0,0);
    }

    public boolean print(char[][] grid,int row,int col) {
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            return true;
        }

        if(grid[row][col]!='.'){
           return print(grid,row,col+1);
        }

        else{
            for (char val='1';val<='9';val++){
                if(safe(grid,row,col,val)){
                    grid[row][col]=val;
                    boolean ans=print(grid,row,col+1);
                    if (ans){
                        return true;
                    }
                    grid[row][col]='.';
                }
            }
        }
        return false;
    }

    public boolean safe(char[][]grid,int row,int col,char val){
        //row
        for(int c=0;c<9;c++){
            if(grid[c][col]==val){
                return false;
            }
        }
        //col
        for(int c=0;c<9;c++){
            if(grid[row][c]==val){
                return false;
            }
        }

        //grid
        int r=row-row%3;
        int c=col-col%3;
        for (int i=r;i<r+3;i++){
            for (int j=c;j<c+3;j++){
                if (grid[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }

}