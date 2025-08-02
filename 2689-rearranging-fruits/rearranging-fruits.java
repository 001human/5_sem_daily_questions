class Solution {
    public long minCost(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            map.put(arr2[i],map.getOrDefault(arr2[i],0)-1);
            min=Math.min(arr1[i],min);
            min=Math.min(arr2[i],min);
        }

        long ans=0;
        int pos=0;
        int neg=0;
        for(int i:map.keySet()){
            if(Math.abs(map.get(i))%2==1) return -1;
            if(map.get(i)>0) pos+=map.get(i);
            else neg+=Math.abs(map.get(i));
        }   
        if(pos!=neg) return -1;

        List<Integer>tmp=new ArrayList<>();
        List<Integer>tmp1=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)>0){
                for(int j=0;j<map.get(i)/2;j++){
                    tmp.add(i);
                }
            }
            else {
                for(int j=0;j<Math.abs(map.get(i))/2;j++){
                    tmp1.add(i);
                }
            }
        }

        Collections.sort(tmp);
        Collections.sort(tmp1);
        for(int i=0;i<tmp.size();i++){
            ans+=Math.min(2*min,Math.min(tmp.get(i),tmp1.get(tmp1.size()-1-i)));
        }
        return ans;
    }
}