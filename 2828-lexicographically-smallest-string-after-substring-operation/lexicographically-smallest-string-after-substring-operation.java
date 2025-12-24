class Solution {
    public String smallestString(String s) {
        int i=0;
        String ans="";
        while(i<s.length() && s.charAt(i)=='a'){
            i++;
        }
        int n=s.length();
        char[] chars = s.toCharArray();
        if(i==n){
            chars[n-1] = 'z';
            return String.valueOf(chars);
        }
        int j=i;
        while (j<n && chars[j]!= 'a') {
            chars[j] -= 1;
            j++;
        }
        return String.valueOf(chars);
    }
}