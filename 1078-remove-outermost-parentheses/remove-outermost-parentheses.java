class Solution {
    public String removeOuterParentheses(String s) {
        HashSet<Integer>ls=new HashSet<>();
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') open++;
            else close++;

            if(open==close ){
                 ls.add(i);
                 ls.add(i-2*open+1);
                 open=0;
                 close=0;
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ls.contains(i)) continue;
            sb.append(ch+"");
        }
        return String.valueOf(sb);

    }
}