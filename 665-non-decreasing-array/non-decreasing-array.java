class Solution {
    public boolean checkPossibility(int[] arr) {
        int a= arr.length-lengthOfLIS(arr);
        if(a<=1) return true;
        return false;

    }

    public int lengthOfLIS(int[] arr) {
        int[]lis=new int[arr.length];
        lis[0]=arr[0];
        int len=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=lis[len-1]){
                lis[len++]=arr[i];
            }
            else{
                int idx=find(0,len-1,lis,arr[i]);
                lis[idx]=arr[i];
            }
        }
        return len;
    }

    public int find(int start,int end,int[]arr,int t){
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>t){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
}

    
