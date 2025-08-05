class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        int n=f.length;
        int count=f.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<b.length;j++){
                if(f[i]<=b[j]){
                    count--;
                    b[j]=-1;
                    break;
                }
            }
        }
        return count;
    }
}