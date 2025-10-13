class Solution {
    public boolean canPlaceFlowers(int[] arr1, int n) {
        int[]arr=new int[arr1.length+2];
        arr[0]=0;
        arr[arr.length-1]=0;
        for(int i=1;i<arr.length-1;i++){
            arr[i]=arr1[i-1];
        }

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==0 && n!=0){
                if(arr[i-1]==0 && arr[i+1]==0){
                    arr[i]=1;
                    n--;
                }
            }
        }
        return n==0;
    }
}