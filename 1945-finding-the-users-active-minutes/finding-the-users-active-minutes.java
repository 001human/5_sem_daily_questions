class Solution {
    public int[] findingUsersActiveMinutes(int[][] arr, int k) {
        HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int id=arr[i][0];
            int time=arr[i][1];
            HashSet<Integer> set = map.getOrDefault(id, new HashSet<>());
            set.add(time);
            map.put(id,set);
        }
        int[]ans=new int[k];
        for(Map.Entry<Integer,HashSet<Integer>>entry:map.entrySet()){
            HashSet<Integer> set = entry.getValue();
            int s=set.size();
            ans[s-1]++;
        }
        return ans;
    }
}