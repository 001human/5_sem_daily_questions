class Solution {
    static int ans;
    public int minimumBuckets(String s) {
        int ans=0;
        char []arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]=='H'){
                if(i-1>=0 && arr[i-1]=='b') continue;
                else if((i+1)<arr.length && arr[i+1]=='.') {
                    arr[i+1]='b';
                    ans++;
                }
                else if(i-1>=0 && arr[i-1]=='.') {
                    arr[i-1]='b';
                    ans++;
                }
                else return -1;
            }
        }
        return ans;      
    }
}