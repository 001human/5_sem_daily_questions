class Solution {
    public boolean isValid(String s) {
        int x=s.length();
        
            while(s.contains("[]")||s.contains("()")||s.contains("{}")){
                s=s.replace("[]","");
            
            
                s=s.replace("()","");
            
         
                s=s.replace("{}","");
            
            }
            if(s.equals("")) return true;
        
        return false;
    }
}