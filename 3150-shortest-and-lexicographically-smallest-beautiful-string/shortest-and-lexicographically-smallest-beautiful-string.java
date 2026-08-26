class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String>ls=new ArrayList<>();
        
        int r=0;
        int l=0;
        int n=s.length();
        int t=0;
        while(r<n){
            char ch=s.charAt(r);
            if(ch=='1') t++;
            while(t==k && l<=r){
                ls.add(s.substring(l,r+1));
                char ch1=s.charAt(l);
                if(ch1=='1') t--;
                l++;
            } 
            
            r++;
        }
        ls.sort((a, b) -> {
        if (a.length() != b.length()) {
            return Integer.compare(a.length(), b.length());
        }
        return a.compareTo(b);
        });

        if(ls.size()>0) return ls.get(0);
        return "";
    }
}