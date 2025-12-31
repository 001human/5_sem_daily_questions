class Solution {
    public boolean validPath(int n, int[][] arr, int s, int d) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        return bft(map,s,d);
    }

    public boolean bft(HashMap<Integer,ArrayList<Integer>>map,int s,int d){
        HashSet<Integer>visit=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int r=q.poll();
            if(visit.contains(r)) continue;
            visit.add(r);
            if(r==d) return true;
            for(int nbrs:map.get(r)){
                if(!visit.contains(nbrs)) q.add(nbrs);
            }
        }
        return false;
    }
}