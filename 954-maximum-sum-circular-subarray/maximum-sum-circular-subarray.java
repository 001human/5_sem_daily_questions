class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int total = 0;
        for(int i : arr){
            total += i;
        }

        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        //finding max
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
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
       if(total - minsum == 0) return max;
       return Math.max(max, total-minsum);
    }
}