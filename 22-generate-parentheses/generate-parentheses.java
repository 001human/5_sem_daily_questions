class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        fun(ans,n,0,0,"");
        return ans;
    }
    public void fun(List<String>ans,int n,int r,int l,String s){
        if(l==n && r==n){
            ans.add(s);
            return;
        }
        if(l<n){
            fun(ans,n,r,l+1,s+"(");
        }
        if(r<l){
            fun(ans,n,r+1,l,s+")");
        }
    }
}