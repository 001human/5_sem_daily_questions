class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(arr,0,ans,temp);
        return ans;
    }

    public void fun(int[]arr,int i,List<List<Integer>>ans,List<Integer>temp){
        if(i==arr.length){
            ans.add(new ArrayList(temp));
            return;
        }
        temp.add(arr[i]);
        fun(arr,i+1,ans,temp);
        temp.removeLast();
        fun(arr,i+1,ans,temp);
    }
}