class Solution {
    public boolean isValidSudoku(char[][] arr) {
         for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]!='.' && safe(arr,row,col,arr[row][col])==false) return false;
            }
         }
         return true;
    }

    public boolean safe(char[][] arr,int row,int col,char val){
        for(int i=0;i<9;i++){
            if(i!=col && arr[row][i]==val) return false;
        }
        for(int i=0;i<9;i++){
            if(i!=row && arr[i][col]==val) return false;
        }

        int r=row-row%3;
        int c=col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if((i!=row || j!=col) && arr[i][j]==val) return false;
            }
        }
        return true;
    }
}