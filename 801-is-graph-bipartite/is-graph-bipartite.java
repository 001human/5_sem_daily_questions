class Solution {
    public boolean isBipartite(int[][] arr) {
        //to find the bipartite graph we need to find a odd length cycle 
        for(int i=0;i<arr.length;i++){
            Queue<pair>q=new LinkedList<>();
            HashMap<Integer,Integer>visited=new HashMap<>();
            q.add(new pair(i,0));
            while(!q.isEmpty()){
                pair p=q.poll(); //remove
                if(visited.containsKey(p.vtx)){ //ignore
                    if(p.dist!=visited.get(p.vtx)){
                        return false;
                    }
                }
                visited.put(p.vtx,p.dist);//add visited
                //self work
                //add neighbors
                for(int nbrs:arr[p.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new pair(nbrs,p.dist+1));
                    }
                }
            }
        }
        return true;
    }

    class pair{
        int vtx;
        int dist;
        public pair(int vtx,int dist){
            this.vtx=vtx;
            this.dist=dist;
        }
    }
}