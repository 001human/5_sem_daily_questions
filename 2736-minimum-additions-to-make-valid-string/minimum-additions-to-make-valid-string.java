class Solution {
    public int addMinimum(String s) {
        String m="abc";
        int ans=0;
        int j=0;
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch!=m.charAt(j)){
                ans++;
                j++;
                
            }
            else {
                j++;
                i++;
            }
            if(j==3) j=0;
        }
        if(j!=0) ans=ans+(3-j);
        return ans;
    }
}