class Solution {
    public boolean isValid(String s) {
        int x=s.length();
        for(int i=0;i<(x+1)/2;i++){
            while(s.contains("()")) s=s.replace("()","");
            while(s.contains("[]")) s=s.replace("[]","");
            while(s.contains("{}")) s=s.replace("{}","");
            if(s.equals("")) return true;
        }
        return false;
    }
}