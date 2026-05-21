class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            String s=String.valueOf(arr1[i]);
            for(int j=1;j<=s.length();j++){
                String temp=s.substring(0,j);
                if(set.contains(temp)) continue;
                else set.add(temp);
            }
        }

        int ans=0;
        for(int i=0;i<arr2.length;i++){
            String s=String.valueOf(arr2[i]);
            for(int j=1;j<=s.length();j++){
                String temp=s.substring(0,j);
                if(set.contains(temp)) ans=Math.max(ans,temp.length());
            }
        }
        return ans;
    }
}