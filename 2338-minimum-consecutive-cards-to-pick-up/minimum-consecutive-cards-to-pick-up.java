class Solution {
    public int minimumCardPickup(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        while(end<arr.length){
            map.put(arr[end],map.getOrDefault(arr[end],0)+1);
            while( map.get(arr[end])==2){
                ans=Math.min(ans,end-start+1);
                map.put(arr[start],map.get(arr[start])-1);
                if(map.get(arr[start])==0) map.remove(arr[start]);
                start++;
            }
            end++;
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}