class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> w, int[][] f, int id, int l) {
        HashSet<Integer>visit=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(id);
        visit.add(id);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                int r=q.poll();
                // if(visit.contains(r)) continue;
                for(int nbrs:f[r]){
                    if(!visit.contains(nbrs)) {
                        visit.add(nbrs);
                        q.add(nbrs);
                        }
                }
            }
            l--;
            if(l==0) break;
        }

        //queue contains ids of friends at that particular level
        //count the ferquency 
        HashMap<String,Integer>fre=new HashMap<>();
        while(!q.isEmpty()){
            int r=q.poll();
            List<String>a=w.get(r);
            for(int i=0;i<a.size();i++){
                String s=w.get(r).get(i);
                fre.put(s,fre.getOrDefault(s,0)+1);
            }
        }
        ArrayList<String>arr=new ArrayList<>(fre.keySet());
        Collections.sort(arr,(a,b)->{
            if(fre.get(a)==fre.get(b)) return a.compareTo(b);
            else return fre.get(a)-fre.get(b);
        });
        
        return arr;
    }
}