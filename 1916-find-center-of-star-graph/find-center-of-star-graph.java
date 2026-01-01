class Solution {
    public int findCenter(int[][] arr) {
        int[]fre=new int[arr.length+2];
        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            fre[a]++;
            fre[b]++;
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]==arr.length) return i;
        }
        return 0;
    }
}