class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0;
        int r=0;
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sorted = new String(arr1);
        List<Integer>ans=new ArrayList<>();
        while(r<s2.length()){
            while((r-l+1)>s1.length()){
                l++;
            }
            if((r-l+1)==s1.length()){
                String t=s2.substring(l,l+s1.length());
                char[] arr = t.toCharArray();
                Arrays.sort(arr);
                String newsorted = new String(arr);
                if(sorted.equals(newsorted)) return true;
            }
            r++;
        }
        return false;
    }
}