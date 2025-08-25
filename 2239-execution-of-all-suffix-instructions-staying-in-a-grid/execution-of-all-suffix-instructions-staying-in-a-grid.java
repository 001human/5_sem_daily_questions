class Solution {
    public int[] executeInstructions(int n, int[] start, String s) {
        int[]ans=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int r=start[0];
            int c=start[1];
            int store=0;
            //left and riight row same col change
            //up and down col same row change
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='R'){
                    c++;
                    if(c<n) store++;
                    else break;
                }
                else if(s.charAt(j)=='L'){
                    c--;
                    if(c>=0) store++;
                    else break;
                }
                else if(s.charAt(j)=='D'){
                    r++;
                    if(r<n) store++;
                    else break;
                }
                else {
                    r--;
                    if(r>=0) store++;
                    else break;
                }
            }
            ans[i]=store;
        }
        return ans;
    }
}