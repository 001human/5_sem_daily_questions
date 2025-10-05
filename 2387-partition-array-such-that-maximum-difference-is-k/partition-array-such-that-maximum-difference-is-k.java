class Solution {
    public int partitionArray(int[] arr, int k) {
        Arrays.sort(arr);
        int ans=0;
        int max=0;
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            max=arr[i];
            if(Math.abs(min-max)>k ){
                ans++;
                min=arr[i];
            }
        }
        return ans+1;
    }
}
