class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int[]pre=new int[n];
        Stack<Integer>st=new Stack<>();
        //next smallest on right
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                pre[st.pop()]=i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            pre[st.pop()]=n;
        }

        //next smallest on left
        int[]suf=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                suf[st.pop()]=i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            suf[st.pop()]=-1;
        }
        int area=0;
        for(int i=0;i<n;i++){
            area=Math.max(area,arr[i]*(pre[i]-suf[i]-1));
        }
        return area;
    }
}