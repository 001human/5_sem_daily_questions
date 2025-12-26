class Solution {
    public int getCommon(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],0);
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])) return arr2[i];
        }
        return -1;
    }
}