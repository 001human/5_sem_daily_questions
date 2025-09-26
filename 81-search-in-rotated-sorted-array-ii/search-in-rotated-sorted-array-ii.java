class Solution {
    public boolean search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<end && arr[start]==arr[start+1]) start++;
        while(end>start && arr[end]==arr[end-1]) end--;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]>=arr[0]){   //left part is sortted
                if(target>=arr[start] && target<=arr[mid]){
                    end=mid-1;
                }
                else start=mid+1;
            }
            else{
                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }
                else end=mid-1;
            }
        }
        return false;
    }
}
