class Solution {
    public int latestTimeCatchTheBus(int[] b, int[] p, int c) {
        Arrays.sort(b);
        Arrays.sort(p);
        int ans=0;
        int j=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<b.length;i++){
            int c1=0;
            while(c1<c && j<p.length && p[j]<=b[i]){
                if(!set.contains(p[j]-1)){
                    ans=p[j]-1;
                }
                set.add(p[j++]);
                c1++;
            }
            if(c1<c && !set.contains(b[i])){
                ans=b[i];
            }
        }
        return ans;
    }
}