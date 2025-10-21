class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer>st=new Stack<>();
        int m=arr.length;
        for(int i=0;i<m;i++){
           if(st.isEmpty()) st.push(arr[i]);
           else if(arr[i]>0) st.push(arr[i]);
           else{
            boolean check=true;
            while(!st.isEmpty() && arr[i]<0 && st.peek()>0){
                if(Math.abs(arr[i])>st.peek()){
                    st.pop();
                }
                else if(Math.abs(arr[i])==st.peek()){
                    st.pop();
                    check=false;
                    break;
                }
                else{
                    check=false;//if the -ve value was smaller so we doont add it
                    break;
                }
            }
            if(check==true) st.push(arr[i]);
           }
            
        }
        int []ans=new int[st.size()];
        int n=st.size();
        for(int i=n-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}