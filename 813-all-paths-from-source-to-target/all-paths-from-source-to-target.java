class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(arr,0,arr.length-1,temp,ans);
        return ans;
    }

    public void fun(int[][]arr,int src,int dest,List<Integer>temp,List<List<Integer>>ans){
        if(src==dest){
            temp.add(dest);
            ans.add(new ArrayList<>(temp));
            temp.removeLast();
        }
        for(int i=0;i<arr[src].length;i++){
            temp.add(src);
            fun(arr,arr[src][i],dest,temp,ans);
            temp.removeLast();
        }
    }
}