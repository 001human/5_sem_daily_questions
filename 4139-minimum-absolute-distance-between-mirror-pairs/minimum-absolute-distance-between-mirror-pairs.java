class Solution {
    public int minMirrorPairDistance(int[] arr) {
        int ans=Integer.MAX_VALUE;
        HashMap<Long,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey((long)arr[i])){
                ans=Math.min(ans,Math.abs(i-map.get((long)arr[i])));
                map.put((long)arr[i],i);
            }
            else{
                map.put((long)rev(arr[i]),i);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public long rev(long n){
        StringBuilder s= new StringBuilder(String.valueOf(n));
        s=s.reverse();
        return Long.parseLong(String.valueOf(s));
    }
}