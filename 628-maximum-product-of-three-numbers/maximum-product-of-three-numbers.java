class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int p1=arr[n-1]*arr[n-2]*arr[n-3];
        int p2=arr[0]*arr[1]*arr[n-1];
        return Math.max(p1,p2);
    }
}