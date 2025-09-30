class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return fun(k,arr)-fun(k-1,arr);
    }

    public int fun(int k, int []arr){
        if(k<=0) return 0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int r=0;
        int l=0;
        int ans=0;
        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(l<r && map.size()>k){
                //remove
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }
            if(map.size()<=k){
                ans+=r-l+1;
            }
            r++;
        }
        return ans;
    }
}