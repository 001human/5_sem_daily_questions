class Solution {
    public int maximumProduct(int[] arr, int k) {
        int mod=1000000007;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(k-->0){
            int x=pq.poll();
            x+=1;
            pq.add(x);
        }
        long ans=1;
        while(!pq.isEmpty()){
            ans=(1l*ans*pq.poll())%mod;
        }
        return (int)ans%mod;
    }
}