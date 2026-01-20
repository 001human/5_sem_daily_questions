class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr2.length];
        Arrays.fill(ans, -1);
        for (int i = 0; i < arr2.length; i++) {
            while (!st.isEmpty() && arr2[st.peek()] < arr2[i]) {
                ans[st.pop()]=arr2[i];
            }
            st.push(i);
        }
        
        int []fin=new int[arr1.length];
        Arrays.fill(fin, -1);
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    fin[i]=ans[j];
                }
            }
        }
        return fin;
    }
}