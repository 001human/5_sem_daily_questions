class Solution {
    public String removeKdigits(String s, int k) {
        //if a number is greater than curent then remove it from stack 
        if(k>=s.length()) return "0";
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'0';
            if(st.isEmpty() ) {
                st.push(n);
                continue;
            }
            while(!st.isEmpty() && st.peek()>n && k>0){
                st.pop();
                k--;
            }
            st.push(n);
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String ans=sb.reverse().toString();
        if(k>0){
            ans = ans.substring(0,ans.length()-k);
        }

        int index=-1;
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)>'0'){
                index=i;
                break;
            }
        }
        if(index==-1){
            return "0";
        }
        return ans.substring(index);

    }
}