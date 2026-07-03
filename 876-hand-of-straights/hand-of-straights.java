class Solution {
    public boolean isNStraightHand(int[] arr, int s) {
        if(arr.length%s!=0) return false;
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        while(!map.isEmpty()){
            int k=map.firstKey();
            for(int i=0;i<s;i++){
                if(map.get(k+i)==null) return false;
                map.put((k+i), map.get(k+i)-1);
                if(map.get(k+i)==0) map.remove(k+i);
            }
        }
        
        return true;
    }
}

