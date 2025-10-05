class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>temp=new ArrayList<>();
        fun(ans,temp,s);
        return ans;
    }

    public void fun(List<List<String>>ans,List<String>temp,String s){
        if(s.length()==0){
            ans.add(new ArrayList(temp));
            return;
        }

        for(int i=1;i<=s.length();i++){
            String x=s.substring(0,i);
            if(pal(x)){
                temp.add(x);
                fun(ans,temp,s.substring(i));
                temp.removeLast();
            }
        }
    }

    public boolean pal(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}