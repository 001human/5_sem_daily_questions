class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[]ns=new int[n];
        int[]ps=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i] ){
                ns[st.pop()]=i;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            ns[st.pop()]=n;
        }

        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>arr[i]   ){
                ps[st.pop()]=i;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            ps[st.pop()]=-1;
        }

        int mod=1000_000_007;
        long ans=0;

        for(int i=0;i<n;i++){

            long t=( 1L*(i-ps[i])*(ns[i]-i) ) %mod;
            ans= (ans + (1L*arr[i]*t*1L)%mod)%mod;
        }

        return (int)(ans%mod);
    }
}