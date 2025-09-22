class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>max) max=map.get(num);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==max) ans+=max;
        }
        return ans;
    }
}