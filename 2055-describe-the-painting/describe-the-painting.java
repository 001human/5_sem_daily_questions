class Solution {
    public List<List<Long>> splitPainting(int[][] arr) {
        TreeMap<Long,Long>map=new TreeMap<>();
        for(int []a:arr){
            long b=a[0];
            long c=a[1];
            long d=a[2];
            map.put(b,map.getOrDefault(b,0L)+d);
            map.put(c,map.getOrDefault(c,0L)-d);
        }
        long start=-1;
        long end=-1;
        long sum=0;
        List<List<Long>>ans=new ArrayList<>();
        for(Map.Entry<Long,Long>entry:map.entrySet()){
            long k=entry.getKey();
            long v=entry.getValue();
            if(start==-1){
                start=k;
                sum=v;
            }
            else{
                end=k;
                if(sum!=0) ans.add(Arrays.asList(start,end,sum));
                start=end;
                sum+=v;
            }
        }
        return ans;
    }
}