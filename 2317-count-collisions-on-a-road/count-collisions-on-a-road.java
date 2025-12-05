class Solution {
    public int countCollisions(String s) {
        int n=s.length();
        int ans=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(st.isEmpty()) st.push(ch);
            else if(!st.isEmpty() && st.peek()=='S' && ch=='S') continue;
            else if(ch=='S'){
                    while( !st.isEmpty() && st.peek()=='R'){
                        ans++;
                        st.pop();
                    }
                    st.push(ch);
                }
            else if(st.peek()=='S' && ch=='L') {
                ans++;
                continue;
            }
            else if( (ch=='L' && st.peek()=='R') ){
                st.pop();
                ans+=2;
                while( !st.isEmpty() && st.peek()=='R'){
                        ans++;
                        st.pop();
                    }
                st.push('S');
            }

            else st.push(ch);
        }
        return ans;
    }
}