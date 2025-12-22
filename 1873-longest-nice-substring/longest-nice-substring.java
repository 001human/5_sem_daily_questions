class Solution {
    public String longestNiceSubstring(String s) {
        int[]sm=new int[26];
        int[]c=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z') sm[ch-'a']++;
            if(ch>='A' && ch<='Z') c[ch-'A']++;
        }
        String ck="";
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(sm[i]>0){
                if(c[i]==0) {
                    ck+=(char)('a'+i);
                    ls.add(i);
                }
            }
            if(c[i]>0){
                if(sm[i]==0) {
                    ck+=(char)('A'+i);
                    ls.add(i);
                }
            }
        }
        if(ck.equals("")) return s;
        //find the points where the window breaks and fins max length
        int start = 0;
String ans = "";

for (int i=0;i<s.length();i++) {
    char ch=s.charAt(i);

    if (ck.indexOf(ch)!= -1) {
        if (i>start){
            String sub = longestNiceSubstring(s.substring(start, i));
            if (sub.length() > ans.length()) ans = sub;
        }
        start=i+1;
    }
}

if (start<s.length()) {
    String sub=longestNiceSubstring(s.substring(start));
    if (sub.length()>ans.length()) ans =sub;
}

return ans;


    }
}