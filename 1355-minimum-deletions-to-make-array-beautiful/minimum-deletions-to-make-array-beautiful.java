class Solution {
    public int minDeletion(int[] arr) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int idx=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(arr[i]);
                idx++;
                continue;
            }
            if(st.size()>0 && st.peek()==arr[i] && idx%2==1) {
                ans++;
                continue;
            } 
            else{
                st.push(arr[i]);
                idx++;
            }
        }

        if(st.size()%2==1) ans++;
        return ans;

    }
}