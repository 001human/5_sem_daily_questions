class Solution {
    public boolean closeStrings(String s1, String s2) {
        int[]arr1=new int[26];
        int[]arr2=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            arr1[ch-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            arr2[ch-'a']++;
        }
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<26;i++){
            if( (arr1[i]>0 && arr2[i]==0) || (arr2[i]>0 && arr1[i]==0) ) return false;

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}