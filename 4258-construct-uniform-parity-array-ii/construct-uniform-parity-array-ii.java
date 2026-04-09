class Solution {
    public boolean uniformArray(int[] arr) {
        int even=0;
        int odd=0;
        int min_even=Integer.MAX_VALUE;
        int min_odd=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
                even++;
                min_even=Math.min(min_even,arr[i]);
            }
            else {
                odd++;
                min_odd=Math.min(min_odd,arr[i]);
            }
        }
        if(even==arr.length || odd==arr.length) return true;
        if(min_odd<min_even) return true;
        return false;
    }
}