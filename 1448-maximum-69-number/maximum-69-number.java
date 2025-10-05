class Solution {
    public int maximum69Number (int n) {
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='6'){
                sb.append(""+'9');
                sb.append(s.substring(i+1));
                break;
            }
            else sb.append(""+ch);
        }
        return Integer.parseInt(sb.toString());
    }
}