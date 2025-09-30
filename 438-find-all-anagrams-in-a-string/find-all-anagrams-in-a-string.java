class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l=0;
        int r=0;
        char[] arr1 = p.toCharArray();
        Arrays.sort(arr1);
        String sorted = new String(arr1);
        List<Integer>ans=new ArrayList<>();
        while(r<s.length()){
            while((r-l+1)>p.length()){
                l++;
            }
            if((r-l+1)==p.length()){
                String t=s.substring(l,l+p.length());
                char[] arr = t.toCharArray();
                Arrays.sort(arr);
                String newsorted = new String(arr);
                if(sorted.equals(newsorted)) ans.add(l);
            }
            r++;
        }
        return ans;
    }
}
