class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n=arr.length;
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);
        for (int i = 0; i < arr.length*2; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i%n]) {
                ans[st.pop()]=arr[i%n];
            }
            st.push(i%n);
        }
        return ans;
    }
}