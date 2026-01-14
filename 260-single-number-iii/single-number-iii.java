class Solution {
    public int[] singleNumber(int[] arr) {
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        int mask=(xor & (-1*xor));
        int a=0;
        for(int i=0;i<arr.length;i++){
            if( (arr[i]& mask)!=0 ) a=a^arr[i];
        }
        int b=xor^a;
        return new int[]{a,b};
    }
}