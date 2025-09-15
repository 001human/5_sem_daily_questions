class Solution {
    public int canBeTypedWords(String t, String b) {
        String[]arr=t.split(" ");
        int ans=0;
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            int fl=0;
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(b.contains(""+ch)) {
                    fl=1;
                    break;
                }
            }
            if(fl==0) ans++;
        }
        return ans;
    }
}