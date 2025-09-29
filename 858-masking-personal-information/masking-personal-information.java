class Solution {
    public String maskPII(String s) {
        if(s.contains("@")){
            int index=s.indexOf("@");
            StringBuilder name=new StringBuilder();
            name.append(Character.toLowerCase(s.charAt(0)));
            name.append("*****");
            name.append(Character.toLowerCase(s.charAt(index-1)));
            name.append("@");
            int index2=s.indexOf(".");
            for(int i=index+1;i<s.length();i++){
                name.append(Character.toLowerCase(s.charAt(i)));
            }
           
            return name.toString();
        }
        else{
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch!='+' && ch!='-' && ch!='(' && ch!=')' && ch!=' '){
                    sb.append(""+ch);
                }
            }
            String s1=sb.toString();
            int n=6;
            int x=s1.length();
            if(x==11) n=7;
            else if(x==12) n=8;
            else if(x==13) n=9;
            String t=s1.substring(n);
            if(s1.length()==10){
                return "***-***-"+t;
            }
            else if(s1.length()==11){
                return "+*-***-***-"+t;
            }
            else if(s1.length()==12){
                return "+**-***-***-"+t;
            }
            else {
                return "+***-***-***-"+t;
            }
        }
       
    }
}