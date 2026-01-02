class Solution {
    public int edgeScore(int[] arr) {
        long []fre=new long[arr.length];
        for(int i=0;i<arr.length;i++){
            fre[arr[i]]+=(i);
        }
        long m=0;
        for(int i=0;i<fre.length;i++){
            if(fre[i]>m){
                m=Math.max(m,fre[i]);
            }
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]==m) return i;
        }
        return 0;
    }
}