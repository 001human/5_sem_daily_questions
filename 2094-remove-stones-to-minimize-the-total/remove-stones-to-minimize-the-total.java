class Solution {
    public int minStoneSum(int[] arr, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(k-->0){
            int x=pq.poll();
            pq.add((int)Math.ceil(x/2.0));
        }

        int ans=0;
        while(!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;
    }
}