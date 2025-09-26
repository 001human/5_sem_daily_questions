class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int total = 0;
        for(int i : arr){
            total += i;
        }
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        //finding max
        for(int i=0;i<n;i++){
            sum+=arr[i];
            ans=Math.max(ans,sum);
            if(sum<0) sum=0;
        }

        //finding min
        int min=0;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min+=arr[i];
            minsum=Math.min(min,minsum);
            if(min>0) min=0;
        }
       if(total - minsum == 0) return ans;
        return Math.max(ans, total-minsum);
    }
}