class Solution {
    public int findClosest(int x, int y, int z) {
        int ans=0;
        int a =Math.abs(z-x);
        int b=Math.abs(z-y);
        if(a<b) ans=1;
        else if(a>b) ans=2;
        return ans;
    }
}