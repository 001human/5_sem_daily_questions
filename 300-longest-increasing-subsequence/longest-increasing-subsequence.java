class Solution {
    public int lengthOfLIS(int[] arr) {
        int []lis=new int[arr.length];
        lis[0]=arr[0];
        int len=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lis[len-1]){
                lis[len++]=arr[i];
            }
            else{
                int idx=find(lis,0,len-1,arr[i]);
                lis[idx]=arr[i];
            }
        }
        return len;
    }

    public int find(int[]lis,int start,int end,int t){
        int idx=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(lis[mid]>=t){
                idx=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return idx;
    }
}