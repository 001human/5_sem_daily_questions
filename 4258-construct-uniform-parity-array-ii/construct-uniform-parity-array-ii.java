class Solution {
    public boolean uniformArray(int[] arr) {
        int min_even=Integer.MAX_VALUE;
        int min_odd=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
                min_even=Math.min(min_even,arr[i]);
            }
            else min_odd=Math.min(min_odd,arr[i]);
        }
        if(min_odd==Integer.MAX_VALUE) return true;
        else if( min_even-min_odd>=1 ) return true;
        return false;
    }
}