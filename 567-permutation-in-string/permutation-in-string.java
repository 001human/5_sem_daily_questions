class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[]arr1=new int[26];
        int[]arr2=new int[26];
        if(s1.length()>s2.length()) return false;
        int check=0;
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            arr2[s2.charAt(i)-'a']++;
        }

        boolean fl=true;
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                fl=false;
                break;
            }
        }
        if(fl) return true;
        for(int i=s1.length();i<s2.length();i++){
            arr2[s2.charAt(i)-'a']++;
            arr2[s2.charAt(i-s1.length())-'a']--;
            boolean flag=true;
            for(int j=0;j<26;j++){
                if(arr1[j]!=arr2[j]){
                    flag=false;
                    break;
                }
            }
            if(flag) return true;
        }
        return false;
    }
}