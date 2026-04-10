class Solution {
    public int minimumDistance(int[] arr) {
        //using hashmap
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int r=0;
        int ans=Integer.MAX_VALUE;
        while(r<arr.length){

            if(map.get(arr[r])==null){
                map.put(arr[r],new ArrayList<Integer>());
            }
            map.get(arr[r]).add(r);
            List<Integer>temp=map.get(arr[r]);
            if(map.get(arr[r]).size()==3){
                int t=Math.abs(temp.get(0)-temp.get(1))+Math.abs(temp.get(2)-temp.get(1))+Math.abs(temp.get(0)-temp.get(2));
                ans=Math.min(ans,t);
            }
            if(map.get(arr[r]).size()>3){
                temp.set(0,temp.get(1));
                temp.set(1,temp.get(2));
                temp.set(2,r);
                temp.removeLast();
                int t=Math.abs(temp.get(0)-temp.get(1))+Math.abs(temp.get(2)-temp.get(1))+Math.abs(temp.get(0)-temp.get(2));
                ans=Math.min(ans,t);
            }
            r++;
        }

        
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}