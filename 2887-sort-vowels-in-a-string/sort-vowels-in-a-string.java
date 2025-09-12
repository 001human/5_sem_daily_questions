class Solution {
    public String sortVowels(String s) {
        String check="AEIOUaeiou";
        List<Character>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(check.contains(""+ch)) list.add(ch);
        }
        Collections.sort(list);
        int index=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!check.contains(""+ch)) sb.append(ch);
            else sb.append(list.get(index++));
        }
        return sb.toString();
    }
}