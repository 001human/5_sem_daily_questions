class Solution {
    public List<List<Integer>> combinationSum3(int k, int t) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int[]arr={1,2,3,4,5,6,7,8,9};
        fun(arr,0,temp,ans,t,k);
        return ans;
    }
    
    public void fun(int[]arr,int start,List<Integer>temp,List<List<Integer>>ans,int t,int k){
        if(t==0 && k==0) ans.add(new ArrayList<>(temp));
        if(t<0) return;
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            fun(arr,i+1,temp,ans,t-arr[i],k-1);
            temp.removeLast();
        }
        
    }
}
