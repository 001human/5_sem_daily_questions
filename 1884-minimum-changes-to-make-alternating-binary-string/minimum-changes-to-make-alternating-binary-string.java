class Solution {
    public int minOperations(String s) {
        char[]arr=s.toCharArray();
        int a1=0;
        int a2=0;
        int pre='0';
        for(int i=0;i<arr.length;i++){
            if(pre!=arr[i]) a1++;
            if(pre=='0') pre='1';
            else pre='0';
        }
        pre='1';
        for(int i=0;i<arr.length;i++){
            if(pre!=arr[i]) a2++;
            if(pre=='0') pre='1';
            else pre='0';
        }
        return Math.min(a1,a2);
    }
}