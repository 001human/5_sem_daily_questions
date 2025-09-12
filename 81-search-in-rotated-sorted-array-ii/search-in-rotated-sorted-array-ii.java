class Solution {
    public boolean search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<end && arr[start]==arr[start+1]) start++;
        while(end>start && arr[end]==arr[end-1]) end--;
        while(start<=end){
            int mid=end+(start-end+1)/2;
            if(arr[mid]==target) return true;
            if(arr[mid]>arr[0]){//left sorted

                if(target>=arr[0] && target<arr[mid]) end=mid-1;
                else start=mid+1;
            }
            else{ //left sorted
                if(target>arr[mid] && target<=arr[arr.length-1]) start=mid+1;
                else end=mid-1;
            }
        }
        return false;
    }
}
