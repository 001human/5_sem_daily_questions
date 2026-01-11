class Solution {
    public int minLength(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        while(r<arr.length){
            if(map.get(arr[r])==null) sum+=arr[r];
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(sum>=k){
                ans=Math.min(ans,r-l+1);
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    sum-=arr[l];
                    map.remove(arr[l]);
                }
                l++;
            }
            r++;
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}