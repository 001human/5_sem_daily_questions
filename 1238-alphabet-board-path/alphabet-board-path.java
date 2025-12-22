class Solution {
    public String alphabetBoardPath(String s) {
        int x=0;
        int y=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int x1=(ch-'a')/5;
            int y1=(ch-'a')%5;
            while(x>x1){
                sb.append('U');
                x--;
            }
            while(y<y1){
                sb.append('R');
                y++;
            }
            while(y>y1){
                sb.append('L');
                y--;
            }
            while(x<x1){
                sb.append('D');
                x++;
            }
            
            
            
            sb.append('!');
        }
        return sb.toString();
    }
}