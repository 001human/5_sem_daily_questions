class Solution {
    public int networkDelayTime(int[][] arr, int n, int k) {
        HashMap<Integer,List<int[]>>map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }

        for(int []temp:arr){
            int a=temp[0];
            int b=temp[1];
            int c=temp[2];
            map.get(a).add(new int[]{b,c});
        }

        int[]dist=new int[n+1];
        for(int i=0;i<dist.length;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k,0});
        dist[k]=0;
        while(!pq.isEmpty()){
            int[]temp=pq.poll();
            int a=temp[0];
            int b=temp[1];
            for(int[]n1:map.get(a)){
                int c=n1[0];
                int d=n1[1];
                if(b+d<dist[c]){
                    dist[c]=b+d;
                    pq.add(new int[]{c,dist[c]});
                }
            }
        }
        int ans=0;
        for(int i=1;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
}