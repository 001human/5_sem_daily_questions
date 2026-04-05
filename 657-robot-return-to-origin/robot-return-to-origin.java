class Solution {
    public boolean judgeCircle(String s) {
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='U') x++;
            else if(ch=='D') x--;
            else if(ch=='R') y++;
            else y--;
        }
        if(x==0 && y==0) return true;
        return false;
    }
}