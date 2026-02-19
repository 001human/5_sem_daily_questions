class Solution {
    public int countBinarySubstrings(String s) {
        int z=0;
        int o=0;
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                if(o>0) ls.add(o);
                o=0;
                z++;
            }
            else {
                if(z>0) ls.add(z);
                z=0;
                o++;
            }
        }
        ls.add(Math.max(o,z));
        int ans=0;
        for(int i=1;i<ls.size();i++){
            ans+=Math.min(ls.get(i-1),ls.get(i));
        }
        return ans;
    }
}