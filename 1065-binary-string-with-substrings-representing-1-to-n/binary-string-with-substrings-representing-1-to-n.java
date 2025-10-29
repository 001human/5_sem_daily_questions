class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
            String c=Integer.toBinaryString(i);
            if(!s.contains(c)) return false;
        }
        return true;
    }
}