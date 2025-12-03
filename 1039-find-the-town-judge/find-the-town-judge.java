class Solution {
    public int findJudge(int n, int[][] arr) {
        int[]in=new int[n+1];
        int[]out=new int[n+1];
        for(int[]temp:arr){
            in[temp[0]]++;
            out[temp[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(out[i]==n-1 && in[i]==0) return i;
        }
        return -1;
    }
}