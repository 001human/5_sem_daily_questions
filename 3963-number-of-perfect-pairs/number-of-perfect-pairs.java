class Solution {
    public long perfectPairs(int[] arr) {
        long ans=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(arr[i]);
        }
        Arrays.sort(arr);
        int r=1;
        for(int i=0;i<arr.length;i++){
            if(r<=i) r=i+1;
            while(r<arr.length && 1L*arr[r]<=1L*arr[i]*2){
                r++;
            }
            ans+=(r-i-1);
        }
        return ans;
    }
}