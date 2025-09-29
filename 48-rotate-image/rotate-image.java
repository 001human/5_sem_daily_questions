class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(i,j,arr);
            }
        }
        //sort each row in descneding order
        int start=0;
        int end=n-1;
        for(int i=0;i<n;i++){
            while(start<=end){
                int temp = arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
            start=0;
            end=n-1;
        }
    }

    public void swap(int i,int j,int[][]arr){
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}