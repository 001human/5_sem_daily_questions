class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int[]ans=new int[n-k+1];
        int x=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.pollFirst();
            }
            while(!q.isEmpty() && arr[q.peekLast()]<arr[i]){
                q.pollLast();
            }
            q.offerLast(i);
            if(i>=k-1){
                ans[x++]=arr[q.peekFirst()];
            }
        }
        return ans;
    }
}