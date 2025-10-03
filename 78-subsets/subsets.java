class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(ans,temp,arr,0);
        return ans;
    }
    public void fun(List<List<Integer>>ans, List<Integer>temp,int[]arr,int index){
        if(index==arr.length){
            ans.add(new ArrayList(temp));
            return;
        }
        temp.add(arr[index]);
        fun(ans,temp,arr,index+1);
        temp.removeLast();
        fun(ans,temp,arr,index+1);
    }
}