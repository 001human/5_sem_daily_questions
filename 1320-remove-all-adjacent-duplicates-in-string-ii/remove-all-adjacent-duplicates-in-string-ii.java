class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st1.isEmpty()){
                st1.push(ch);
                st2.push(1);
            }
            else{
                if(ch==st1.peek()){
                    st1.push(ch);
                    st2.push(st2.peek()+1);
                    if(st2.peek()==k){
                        int temp=k;
                        while(temp-->0){
                            st1.pop();
                            st2.pop();
                        }
                    }
                }
                else{
                    st1.push(ch);
                    st2.push(1);
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!st1.isEmpty()){
            sb.append(st1.pop());
        }
        return sb.reverse().toString();
    }
}