class Solution {
    public boolean exist(char[][] arr, String word) {
        boolean ans=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                ans=fun(word,i,j,arr,0);
                if(ans==true) return true;
            }
        }
        return false;
    }

    public boolean fun(String word,int row,int col,char [][]arr,int index){
        if(index==word.length()) return true;
        if(row<0 || col<0 || row>=arr.length || col>=arr[0].length || index>word.length() || arr[row][col]!=word.charAt(index)) return false;
        char ch=arr[row][col];
        arr[row][col]='#';

        boolean f=
        fun(word,row-1,col,arr,index+1) ||
        fun(word,row+1,col,arr,index+1) ||
        fun(word,row,col-1,arr,index+1) ||
        fun(word,row,col+1,arr,index+1);
        
        arr[row][col]=ch;
        return f;
    }
}