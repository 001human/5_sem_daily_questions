class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(arr,0,temp,ans,t);
        return ans;
    }
    
    public void fun(int[]arr,int start,List<Integer>temp,List<List<Integer>>ans,int t){
        if(t==0) ans.add(new ArrayList<>(temp));
        if(t<0) return;
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            fun(arr,i+1,temp,ans,t-arr[i]);
            temp.removeLast();
        }
        
    }
}
