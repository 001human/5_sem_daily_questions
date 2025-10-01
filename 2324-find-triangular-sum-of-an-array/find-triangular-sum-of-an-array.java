class Solution {
    public int triangularSum(int[] arr) {
        int x=1;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-x;j++){
                arr[j]=(arr[j]+arr[j+1])%10;
            }
            x++;
        }
        return arr[0];
    }
}