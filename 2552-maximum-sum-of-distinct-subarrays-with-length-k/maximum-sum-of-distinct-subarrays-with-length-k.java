class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        if(arr.length<k) return 0;
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        long ans=0;
        if(map.size()==k) ans=Math.max(ans,sum);
        
        for(int i=k;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            sum+=arr[i];
            sum-=arr[i-k];
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0) map.remove(arr[i-k]);
            if(map.size()==k) ans=Math.max(ans,sum);
        }
        return ans;
    }
}