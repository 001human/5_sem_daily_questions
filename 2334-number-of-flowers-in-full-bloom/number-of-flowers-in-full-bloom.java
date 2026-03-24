class Solution {
    public int[] fullBloomFlowers(int[][] arr, int[] p) {
        List<int[]>ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1]+1;
            ls.add(new int[]{a,1});
            ls.add(new int[]{b,-1});
        }
        Collections.sort(ls,(x,y)->Integer.compare(x[0],y[0]));
        int[][]query=new int[p.length][2];
        for(int i=0;i<p.length;i++){
            query[i][0]=p[i];
            query[i][1]=i;
        }
        Arrays.sort(query,(x,y)->Integer.compare(x[0],y[0]));
        int[]ans=new int[p.length];
        int cur=0;
        int j=0;
        for(int i=0;i<p.length;i++){
            int t=query[i][0];
            int idx=query[i][1];
            while(j<ls.size() && ls.get(j)[0]<=t ){
                cur+=ls.get(j)[1];
                j++;
            }
            ans[idx]=cur;
        }
        return ans;
    }
}