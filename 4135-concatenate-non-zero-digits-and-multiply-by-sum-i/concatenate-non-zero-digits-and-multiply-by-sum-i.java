class Solution {
    public long sumAndMultiply(int n) {
        String x="";
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='0') x+=ch;
        }
        long t=0;
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            t+=(ch-'0');
        }
        if(x.equals("")) return 0;
        return Long.parseLong(x)*t*1L;
    }
}