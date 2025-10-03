class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(ans,temp,arr,t,0);
        return ans;
    }

    public void fun(List<List<Integer>>ans,List<Integer>temp,int[]arr,int t,int i){
        if(t==0){
            ans.add(new ArrayList(temp));
            return;
        }
        if(i>=arr.length || t<0) return;
        temp.add(arr[i]);
        fun(ans,temp,arr,t-arr[i],i);
        temp.removeLast();
        fun(ans,temp,arr,t,i+1);
    }
}