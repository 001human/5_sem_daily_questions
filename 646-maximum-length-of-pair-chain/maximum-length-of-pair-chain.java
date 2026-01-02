class Solution {
    public int findLongestChain(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int ans=1;
        int t=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>t){
                ans++;
                t=arr[i][1];
            }
        }
        return ans;
    }
}