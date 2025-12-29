class Solution {
    public String removeSubstring(String s, int k) {
        Stack<Character>st= new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            st.push(ch);
            if(ch==')') c++;
            else c=0;
            
            if(c==k && st.size()>=2*k){
                int fl=1;
                for(int j=st.size()-k-1;j>=st.size()-2*k;j--){
                    if(st.get(j)!='(') {
                        fl=0;
                        break;
                    }
                }
            if(fl==1){
                int t=2*k;
                while(t-->0){
                    st.pop();
                }
                c=0;
                int idx = st.size()-1;
                while (idx >= 0 && st.get(idx) == ')') {
                    c++;
                    idx--;
                }
            }

            
            }
            
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
}