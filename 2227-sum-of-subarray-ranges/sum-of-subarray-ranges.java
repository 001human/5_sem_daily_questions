class Solution {
    public long subArrayRanges(int[] arr) {
        //first find the next and previous largest number
        // then find the next and previous smallest number
        int n=arr.length;
        int[]pl=new int[n];
        int[]nl=new int[n];
        int[]ps=new int[n];
        int[]ns=new int[n];
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

        ////////larger

         for(int i=0;i<n;i++){
            while(st.size()>0 && arr[st.peek()]<=arr[i] ){
                nl[st.pop()]=i;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            nl[st.pop()]=n;
        }

        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]<arr[i] ){
                pl[st.pop()]=i;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            pl[st.pop()]=-1;
        }

        long ans=0;

        for(int i=0;i<n;i++){
            long t=(i-ps[i])*(ns[i]-i) ;
            ans= ans-arr[i]*t*1L;
        }

        for(int i=0;i<n;i++){
            long t=(i-pl[i])*(nl[i]-i) ;
            ans= ans + arr[i]*t*1L;
        }

        return ans;
        
    }
}