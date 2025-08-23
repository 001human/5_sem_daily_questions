class Solution {
    public long maxKelements(int[] arr, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        long ans=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(k-->0){
            int x=pq.poll();
            ans+=x;
            int a=x/3;
            if(x%3!=0) a++;
            pq.add(a);
        }
        return ans;
    }
}