class Solution {
    public int countBinarySubstrings(String s) {
        int z=0;
        int o=0;
        if(s.charAt(0)=='0') z++;
        else o++;
        int ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                if(s.charAt(i)=='0') z++;
                else o++;
            }
            else{
                ans+=Math.min(o,z);
                if(s.charAt(i)=='0') z=1;
                else o=1;
            }
        }
        ans+=Math.min(o,z);
        return ans;
    }
}