class Solution {
    public boolean isLongPressedName(String s1, String s2) {
        int i=0;
        int j=0;
        while( j<s2.length()){
            if(i<s1.length() && s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else {
                if(j>=1 && s2.charAt(j-1)==s2.charAt(j)) j++;
                else return false;
            }
        }
        if(i==s1.length() ){
            return true;
        }
        return false;
    }
}