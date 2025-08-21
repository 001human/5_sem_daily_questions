class Solution {
    public String largestWordCount(String[] m, String[] s) {
        int []w=new int[m.length];
        for(int i=0;i<m.length;i++){
            String t=m[i];
            String[]temp=t.split(" ");
            w[i]=temp.length;
        }
        HashMap<String,Integer>map=new HashMap<>();
        int max=0;
        for(int i=0;i<w.length;i++){
            map.put(s[i],map.getOrDefault(s[i],0)+w[i]);
            max=Math.max(max,map.get(s[i]));
        }
        List<String>fin=new ArrayList<>();
        for(String key:map.keySet()){
            if(map.get(key)==max) {
                if(fin.size()>=1){
                    if(fin.get(0).compareTo(key)<0){
                        fin.remove(0);
                        fin.add(key);
                    }
                }
                else fin.add(key);
            }
            
        }
        return fin.get(0);
        // PriorityQueue<String>pq=new PriorityQueue<>((a,b)->b.compareTo(a));
        // pq.addAll(fin);
        // return pq.poll();
    }
}