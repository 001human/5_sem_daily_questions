class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[]sb=String.valueOf(n).toCharArray();
        Arrays.sort(sb);
        String s1=new String(sb);
        for(int i=0;i<31;i++){
            long t=(long)Math.pow(2,i);
            char[]sb1=String.valueOf(t).toCharArray();
            Arrays.sort(sb1);
            String s2=new String(sb1);
            if(s1.equals(s2)) return true;
        }
        return false;
    }
}