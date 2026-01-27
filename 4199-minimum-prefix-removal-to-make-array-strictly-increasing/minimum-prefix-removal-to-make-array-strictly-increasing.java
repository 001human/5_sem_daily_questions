class Solution {
    public int minimumPrefixLength(int[] arr) {
        int max=Integer.MAX_VALUE;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]) continue;
            else return i+1;
        }
        return 0;
    }
}