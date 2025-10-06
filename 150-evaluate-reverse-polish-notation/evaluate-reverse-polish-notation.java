class Solution {
    public int evalRPN(String[] arr) {
        Stack<String>st=new Stack<>();
        for(int i=0;i<arr.length;i++){

            if(!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/") ){
                st.push(arr[i]);
            }
            if(arr[i].equals("+")){
                // st.pop();
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(x+y));

            }
            else if(arr[i].equals("-")){
                // st.pop();
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(y-x));
            }
            else if(arr[i].equals("*")){
                // st.pop();
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(y*x));
            }
            else if(arr[i].equals("/")){
                // st.pop();
                int x=Integer.parseInt(st.pop());
                int y=Integer.parseInt(st.pop());
                st.push(String.valueOf(y/x));
            }
            
        }
        return Integer.valueOf(st.peek());
    }
}