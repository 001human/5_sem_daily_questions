class Solution {
    public List<String> twoEditWords(String[] q, String[] arr) {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<q.length;i++){
            String s=q[i];
            for(int j=0;j<arr.length;j++){
                String t=arr[j];
                int c=0;
                for(int k=0;k<t.length();k++){
                   if(s.charAt(k)!=t.charAt(k)) c++;
                }
                if(c<=2) {
                    ans.add(s);
                    break;
                }
                
            }
        }
        return ans;
    }
}