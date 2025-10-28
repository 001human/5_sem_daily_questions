class Solution {
    public String getHappyString(int n, int k) {
    //generate string of length n which consists of a,b,c and no 2 adjacent characters should be same
        List<String>list=new ArrayList<>();
        fun("abc",0,list,n,"",k);
        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
        Collections.sort(list);
        if(k>list.size()) return "";
        return list.get(k-1);
    }

    public void fun(String m,int j,List<String>list,int n,String ans,int k){
        if(ans.length()==n){
            list.add(ans);
            return;
        }
        if(ans.length()>n) return;
        for(int i=0;i<m.length();i++){
            if(ans.isEmpty()) fun(m,i,list,n,ans+m.charAt(i),k);
            else{
                if(m.charAt(i)!=ans.charAt(ans.length()-1)){
                    fun(m,i,list,n,ans+m.charAt(i),k);
                }
            }
        }
    }
}