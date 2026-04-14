class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String>ans=new ArrayList<>();
        int r=0;
        int l=0;
        HashMap<String,Integer>map=new HashMap<>();
        while(r<s.length()){
            if(r-l+1>10){
                l++;
            }
            if(r-l+1==10){
                String p =s.substring(l,r+1);
                if(map.get(p)==null) map.put(p,0);
                map.put(p,map.getOrDefault(p,0)+1);
            }
            r++;
        }
        for(String key:map.keySet()){
            if(map.get(key)>1) ans.add(key);
        }
        return ans;
    }
}