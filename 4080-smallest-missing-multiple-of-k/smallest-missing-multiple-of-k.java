class Solution {
    public int missingMultiple(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],1);
        }
        for(int i=1;i<=arr.length+1;i++){
            int val=k*i;
            if(map.get(val)==null) return val;
        }
        return 0;
    }
}