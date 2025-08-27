class Solution {
    public List<String> topKFrequent(String[] arr, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>>pq=new PriorityQueue<>((a,b)->{
            if(a.getValue().equals(b.getValue())){
                return a.getKey().compareTo(b.getKey());
            }
            else{
                return b.getValue()-a.getValue();
            }
        });
        pq.addAll(map.entrySet());
        List<String>ans=new ArrayList<>();
        while(k-->0){
            Map.Entry<String,Integer>temp=pq.poll();
            ans.add(temp.getKey());
        }
        return ans;
    }
}
