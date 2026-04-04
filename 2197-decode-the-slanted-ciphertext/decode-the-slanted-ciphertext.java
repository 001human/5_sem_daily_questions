class Solution {
    public String decodeCiphertext(String s, int r) {
        if(r==1) return s;
        int c=s.length()/r;
        char[][]arr=new char[r][c];
        int idx=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.charAt(idx++);
            }
        }
        //diagonally traverse and find ans
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<c;j++){
            int t=j;
            for(int i=0;i<r && t<c;i++){
                sb.append(arr[i][t]);
                t++;
            }
        }

        String ans= sb.toString();
        int end=ans.length()-1;
        while(end>=0 && ans.charAt(end)==' ') end--;
        return ans.substring(0,end+1);
    }
}