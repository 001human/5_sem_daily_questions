class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int l=0;
        int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();   
        int n=s.length();
        while(r<n){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char ch1=s.charAt(l);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0) map.remove(ch1);
                l++;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}