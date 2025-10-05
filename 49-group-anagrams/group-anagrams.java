class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:arr){
            char[]ch=s.toCharArray();
            Arrays.sort(ch);
            String k=new String(ch);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}