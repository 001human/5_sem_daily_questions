class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int ans=0;
        for(String s:arr){
            if(s.charAt(0)=='-' || s.charAt(2)=='-') ans--;
            else ans++;
        }
        return ans;
    }
}