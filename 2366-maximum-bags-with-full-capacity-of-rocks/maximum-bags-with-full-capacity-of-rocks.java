class Solution {
    public int maximumBags(int[] c, int[] r, int ex) {
        int[]dif=new int[c.length];
        for(int i=0;i<c.length;i++){
            dif[i]=c[i]-r[i];
        }
        Arrays.sort(dif);
        int ans=0;
        for(int i=0;i<dif.length;i++){
            // if(dif[i]==0) ans++;
            if(dif[i]<=ex){
                ex-=dif[i];
                ans++;
            }
            else break;
        }
        return ans;
    }
}