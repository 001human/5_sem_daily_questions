class Solution {
    public long minArraySum(int[] arr) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            max=Math.max(max,arr[i]);
        }

        long sum=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int fre=entry.getValue();
            for(int i=key;i<=max;i+=key){
                if(map.get(i)!=null && i%key==0){
                    long t=1L*map.get(i)*1L*key*1L;
                    sum+=t;
                    map.put(i,0);
                }
            }
        }
        return sum;
    }
}