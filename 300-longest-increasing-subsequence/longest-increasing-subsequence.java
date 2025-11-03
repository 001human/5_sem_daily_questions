class Solution {
    public int lengthOfLIS(int[] arr) {
        int[]lis=new int[arr.length];
        int len=1;
        lis[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>lis[len-1]){
                lis[len++]=arr[i];
            }
            else{ //finding the number just greater than it and repalce with it
                int index=find(lis,0,len-1,arr[i]);
                lis[index]=arr[i];
            }
        }
        return len; 
    }

    public int find(int[]lis,int start,int end,int t){
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(lis[mid]>=t){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}