class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>ans=new ArrayList<>();
        fun(n,ans,0);
        return ans;
    }
    public void fun(int n,List<Integer>ans,int cur){
        int i=0;
        if(cur>n) return;
        if(cur>0) ans.add(cur);
        if(cur==0) i=1;
        for(;i<=9;i++){
            fun(n,ans,cur*10+i);
        }
    }
}