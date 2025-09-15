class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(arr,t,0,temp,ans);
        return ans;
    }
    public void fun(int[]arr,int t,int i,List<Integer>temp,List<List<Integer>>ans){
        if(t==0){
            ans.add(new ArrayList(temp));
            return;
        }
        if(i>=arr.length || t<0) return;
        temp.add(arr[i]);
        fun(arr,t-arr[i],i,temp,ans);
        temp.removeLast();
        fun(arr,t,i+1,temp,ans);
    }
}