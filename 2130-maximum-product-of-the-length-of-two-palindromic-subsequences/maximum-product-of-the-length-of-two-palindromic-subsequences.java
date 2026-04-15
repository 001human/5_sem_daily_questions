class Solution {
    public int maxProduct(String s) {
        List<Integer>ans=new ArrayList<>();
        fun(s,0,"",ans,0);
        int max=0;
        for(int i=0;i<ans.size();i++){
            int a=Integer.bitCount(ans.get(i));
            for(int j=i+1;j<ans.size();j++){
                if( (ans.get(i) & ans.get(j))==0) {
                    int b=Integer.bitCount(ans.get(j));
                    max=Math.max(max,a*b);
                }
            }
        }
        return max;
    }

    public void fun(String s,int i,String fin,List<Integer>ans,int mask){
        if(i==s.length() && pal(fin)){
            ans.add(mask);
            return;
        }
        if(i>=s.length()) return;
        
        fun(s,i+1,fin+s.charAt(i),ans,(mask | (1<<i) ));
        fun(s,i+1,fin,ans,mask);
    }

    public boolean pal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))  return false;
            i++;
            j--;
        }
        return true;
    }
}