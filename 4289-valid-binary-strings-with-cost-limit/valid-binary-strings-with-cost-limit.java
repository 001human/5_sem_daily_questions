class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String>ans=new ArrayList<>();
        fun(ans,0,"",n,k);
        return ans;
    }

    public void fun(List<String>ans,int i,String s,int n,int k){
        if(k>=0 && s.length()==n){
            ans.add(s);
            return;
        }
        if(k<0 || s.length()>n) return;
        fun(ans,i+1,s+"0",n,k);
        if(s.length()==0 || s.charAt(s.length()-1)!='1') fun(ans,i+1,s+"1",n,k-i);
    }
}