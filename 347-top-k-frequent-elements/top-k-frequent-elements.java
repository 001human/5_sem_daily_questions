class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        int []ans=new int[k];
        int index=0;
        while(k-->0){
            Map.Entry<Integer,Integer>temp=pq.poll();
            ans[index++]=temp.getKey();
        }
        return ans;
    }
}