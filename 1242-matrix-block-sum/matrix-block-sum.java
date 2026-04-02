class Solution {
    public int[][] matrixBlockSum(int[][] arr, int k) {
        int[][]ans=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                ans[i][j]=fun(arr,i,j,k);
            }
        }
        return ans;
    }

    public int fun(int[][]arr,int i,int j,int k){
        int r1=i-k;
        int r2=i+k;
        int c1=j-k;
        int c2=j+k;
        if(r1<0) r1=0;
        if(r2>=arr.length) r2=arr.length-1;
        if(c1<0) c1=0;
        if(c2>=arr[0].length) c2=arr[0].length-1;
        int ans=0;
        for(int r=r1;r<=r2;r++){
            for(int c=c1;c<=c2;c++){
                ans+=arr[r][c];
            }
        }
        return ans;
    }
}