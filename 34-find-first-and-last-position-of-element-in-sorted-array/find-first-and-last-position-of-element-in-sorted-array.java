class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n=arr.length;
        int []ar=new int[2];
        int start=0;
        int end=n-1;
        int a1=-1;
        int a2=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                a1=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
    }
    ar[0]=a1;
    start=0;
    end=n-1;
    while(start<=end){
        int mid=end+(start-end)/2;
        if(arr[mid]==target){
            a2=mid;
            start=mid+1;
        }
        else if(arr[mid]<target){
            start=mid+1;
        }
       
        else{
            end=mid-1;
        }
    }
    ar[1]=a2;
    return ar;
}
}