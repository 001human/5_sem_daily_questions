class Solution {
    public int findLongestChain(int[][] arr) {
        int ans=1;
        Arrays.sort(arr,(a,b)-> Integer.compare(a[1], b[1]));
        int pre=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(pre<arr[i][0]){
                pre=arr[i][1];
                ans++;
            }
        }
        return ans;
    }
}
