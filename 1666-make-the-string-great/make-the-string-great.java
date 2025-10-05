class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean fl=false;
            if(!st.isEmpty() && ( ((char)(st.peek()+32)==ch) || ((char)(st.peek()-32)==ch)) ){
                fl=true;
                st.pop();
            }
            if(fl==false) st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}