class Solution {
    public long[] sumOfThree(long n) {
        long[]arr=new long[3];
        if(n%3!=0) return new long[]{};
        long x=n/3;
        arr[0]=x-1;
        arr[1]=x;
        arr[2]=x+1;
        return arr;
    }
}