class Solution {
    public int maxArea(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int area=0;
        while(l<r){
            int m=Math.min(arr[r],arr[l]);
            area=Math.max(area,(r-l)*m);
            if(arr[l]<arr[r]){
                l++;
            }
            else r--;
        }
        return area;
    }
}