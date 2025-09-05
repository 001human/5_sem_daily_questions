class Solution {
    public int minimumLength(String s) {
        int c=0;
        int start=0;
        int end=s.length()-1;
        if(s.length()==1) return 1;
        while(start<end && s.charAt(end)==s.charAt(start)){
            char c1=s.charAt(start);
            char c2=s.charAt(end);
            while(start<end && s.charAt(start)==c2){
                start++;
            }
            while(end>start && s.charAt(end)==c1){
                end--;
            }
        }
        if(start==end && s.charAt(start-1)==s.charAt(end)) return 0;
        return s.length()+1-(start+1)-(s.length()-end-1);
    }
}