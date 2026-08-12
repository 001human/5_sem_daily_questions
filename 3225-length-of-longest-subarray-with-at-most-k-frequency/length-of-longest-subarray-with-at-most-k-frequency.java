class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int r=0;
        int l=0;
        int ans=0;
        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(map.get(arr[r])>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}