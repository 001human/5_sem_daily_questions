class Solution {
    public void moveZeroes(int[] arr) {
        int start=0;
        int end=0;
        while(end<arr.length){
            if(arr[end]!=0){
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
                start++;
            }
            end++;
        }
    }
}