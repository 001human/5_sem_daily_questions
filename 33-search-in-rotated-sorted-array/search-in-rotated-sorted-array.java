class Solution {
    public int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=end+(start-end)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>arr[0]){//left sorted
                if(target>=arr[0] && target<arr[mid]) end=mid-1;
                else start=mid+1;
            }
            else{ //left sorted
                if(target>arr[mid] && target<=arr[arr.length-1]) start=mid+1;
                else end=mid-1;
            }
        }
        return -1;
    }
}