class Solution {
    public int minimumPrefixLength(int[] arr) {
        int[]pre=new int[arr.length];
        int n=arr.length;
        pre[n-1]=1;
        int max=Integer.MAX_VALUE;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pre[i]=pre[i+1]+1;
                
            }
            else return i+1;
        }
        return 0;
    }
}