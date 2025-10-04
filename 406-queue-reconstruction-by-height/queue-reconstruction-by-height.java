class Solution {
    public int[][] reconstructQueue(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        List<int[]>ans=new ArrayList<>();
        for(int []cur:arr){
            ans.add(cur[1],cur);
        }
        return ans.toArray(new int[arr.length][]);
    }
}