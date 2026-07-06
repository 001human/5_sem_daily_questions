class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });


        int ans=0;
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>=start && arr[i][1]<=end) ans++;
            else {
                start=arr[i][0];
                end=arr[i][1];
            }
        }   
        return arr.length-ans;
    }
}