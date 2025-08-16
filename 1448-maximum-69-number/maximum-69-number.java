class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        String st="";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='6'){
                st=st+'9';
                st=st+s.substring(i+1);
                break;
            }
            else {
                st=st+s.charAt(i);
            }
            
        }
        return Integer.parseInt(st);
    }
}