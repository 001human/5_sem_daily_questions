class Solution {
    public boolean possibleBipartition(int n, int[][] arr) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        Queue<pair>q=new LinkedList<>();
        HashMap<Integer,Integer>visit=new HashMap<>();
        for(int i=1;i<=n;i++){
        if(visit.containsKey(i)) continue;
        q.add(new pair(0,i));
            while(!q.isEmpty()){
                pair r=q.poll();
                if(visit.containsKey(r.vtx)){
                    if(r.dist!=visit.get(r.vtx)) return false;
                }
                visit.put(r.vtx,r.dist);
                for(int nbrs:map.get(r.vtx)){
                    if(!visit.containsKey(nbrs)) q.add(new pair(r.dist+1,nbrs));
                }
            }
        }
        return true;
    }

    class pair{
        int dist;
        int vtx;
        public pair(int dist,int vtx){
            this.dist=dist;
            this.vtx=vtx;
        }
    }
}