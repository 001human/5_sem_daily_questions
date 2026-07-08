class Solution {
    public int minimumDeletions(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int min_index=-1;
        int max_index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                min_index=i;
            }
            if(arr[i]>max){
                max=arr[i];
                max_index=i;
            }
        }
        //calculate distances based on 4 different combinations
        int n=arr.length;
        int d1=Math.max(max_index+1,min_index+1);
        int d2=Math.max(n-max_index,n-min_index);
        int d3=max_index+1 + (n-min_index);
        int d4=min_index+1 + (n-max_index);
        int d5=Math.min(d1,d2);
        int d6=Math.min(d3,d4);
        return Math.min(d5,d6);
    }
}