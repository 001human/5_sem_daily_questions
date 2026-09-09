class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long ans=0;
        int[]arr={3,6,9,12,15};
        int i=0;
        while(n>999 && i<arr.length){
            long temp=(long)Math.pow(10, arr[i]);
            if( n>=temp){
                ans+=n-temp+1;
                i++;
            }
            else break;
        }
        return ans;
    }
}