class Solution {
    public int longestSubsequence(int[] arr, int d) {
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=map.getOrDefault(arr[i]-d,0);
            int ne=a+1;
            map.put(arr[i],ne);
            ans=Math.max(ans,ne);
        }
        return ans;
    }
}