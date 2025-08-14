class Solution {
    public String largestGoodInteger(String s) {
        int ans=-1;
        char pre=s.charAt(0);
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==pre){
                c++;
                if(c>=3){
                    ans=Math.max(ans,Integer.parseInt(""+s.charAt(i)));
                }
            }
            else {
                c=1;
                pre=s.charAt(i);
            }
        }
        if(ans==-1) return "";
        return String.valueOf(ans).repeat(3);
    }
}