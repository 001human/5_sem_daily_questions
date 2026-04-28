class Solution {
    public int compareBitonicSums(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]) start=mid+1;
            else end=mid-1;
        }
        long s1=0,s2=0;
        for(int i=0;i<=start;i++){
            s1+=arr[i];
        }
        for(int i=start;i<arr.length;i++){
            s2+=arr[i];
        }
        if(s1==s2) return -1;
        if(s1>s2) return 0;
        return 1;
    }
}