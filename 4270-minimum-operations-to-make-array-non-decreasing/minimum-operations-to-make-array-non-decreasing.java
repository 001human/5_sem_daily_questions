class Solution {
    public long minOperations(int[] arr) {
        long ans=0;
        int temp1=0;
        for(int i=1;i<arr.length;i++){
            int temp=0;
            if(arr[i]<arr[i-1]){
                temp=arr[i-1]-arr[i];
                if(temp>temp1){
                    ans+=Math.abs(temp-temp1);
                    temp1=Math.abs(temp1-temp);
                    
                }
                arr[i]+=temp1;
            }
            else temp1=0;
        }
        return ans;
    }
}