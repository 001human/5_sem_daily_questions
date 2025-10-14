class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n=nums.length;
        int[][]arr=new int[n][2];
        long t=0;
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=cost[i];
            t+=cost[i];
        }

        //weighted mean approach means cost on left and right almost be equal
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        //finding the pivot point
        long check=0;
        int med=0;
        int i=0;
        while(check<(t+1)/2){
            check+=arr[i][1];
            i++;
        }
        med=arr[i-1][0];

        long ans=0;
        for(int j=0;j<n;j++){
            long x=(long)1L*Math.abs(arr[j][0]-med)*arr[j][1];
            ans+=x;
        }
        return ans;
    }
}