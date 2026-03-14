class Solution {
    static String m="abc";
    public String getHappyString(int n, int k) {
        List<String>ans=new ArrayList<>();
        fun(n,ans,"");
        if(k>ans.size()) return "";
        Collections.sort(ans);
        return ans.get(k-1);
    }

    public void fun(int n,List<String>ans,String s){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        for(int i=0;i<m.length();i++){
            if(s.equals("")) fun(n,ans,s+m.charAt(i));
            else if(m.charAt(i)!=s.charAt(s.length()-1)){
                fun(n,ans,s+m.charAt(i));
            }
        }
    }
}