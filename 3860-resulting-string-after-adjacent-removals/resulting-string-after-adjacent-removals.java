class Solution {
    public String resultingString(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int fl=0;
            if(!st.isEmpty() && ( (st.peek()-'a'+1)%26 == ch-'a' || (st.peek()-'a'+25)%26 ==ch-'a' )){
                st.pop();
                fl=1;
            }
            if(fl==0) st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        if(st.isEmpty()) return "";
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
