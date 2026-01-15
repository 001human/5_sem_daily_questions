class Solution {
    public long maximumScore(int[] arr, String s) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        long ans=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(s.charAt(i)=='1') ans+=pq.poll();
        }
        return ans;
    }
}