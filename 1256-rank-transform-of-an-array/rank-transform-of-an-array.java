class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
         int rank = 1;
        Arrays.sort(temp);
         for (int num : temp) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}