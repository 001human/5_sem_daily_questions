class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return group(strs);
    }

    public List<List<String>>group(String[]arr){
        HashMap<String,List<String>>map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            String key=getkey(arr[i]);
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        List<List<String>>ll=new ArrayList<>();
        for (String key:map.keySet()){
            ll.add(map.get(key));
        }
        return ll;
    }

    public static String getkey(String s){
        int[]fre=new int[26];
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<26;i++){
            sb.append(fre[i]+" ");
        }
        return sb.toString();
    }
}