class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int area=0;
        for(int i=0;i<=n;i++){
            int val=(i==n)?0:arr[i];//if array is sorted then last element we take is 0  arr=> 0 1 2 3 4 5 6
            while(!st.isEmpty() && val<arr[st.peek()]){
                int nsr=i;
                int tbs=st.pop();
                int nsl=st.isEmpty()?-1:st.peek();
                int w=nsr-nsl-1;
                area=Math.max(area,w*arr[tbs]);
            }
            st.push(i);
        }
        return area;
    }
}