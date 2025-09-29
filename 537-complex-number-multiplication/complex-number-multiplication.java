class Solution {
    public String complexNumberMultiply(String s1, String s2) {
        int idx1=s1.indexOf('+');
        int a1=Integer.parseInt(s1.substring(0,idx1));
        int b1=Integer.parseInt(s1.substring(idx1+1,s1.length()-1));
        int idx2=s2.indexOf('+');
        int a2=Integer.parseInt(s2.substring(0,idx2));
        int b2=Integer.parseInt(s2.substring(idx2+1,s2.length()-1));
        int real=a1*a2-b1*b2;
        int img=a1*b2+a2*b1;
        return ""+real+"+"+img+"i";
    }
}