class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int dif=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            dif=Math.min(dif,Math.abs(arr[i]-arr[i+1]));
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==dif){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }
        return ans;
    }
}
