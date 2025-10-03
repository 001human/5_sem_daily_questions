class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(ans,temp,arr,0);
        return ans;
    }
    public void fun(List<List<Integer>>ans, List<Integer>temp,int[]arr,int index){
        ans.add(new ArrayList<>(temp));
        for(int i=index;i<arr.length;i++){
            temp.add(arr[i]);
            fun(ans,temp,arr,i+1);
            temp.removeLast();
        }
    }
}