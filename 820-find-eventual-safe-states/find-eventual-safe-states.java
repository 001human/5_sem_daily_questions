class Solution {
    public List<Integer> eventualSafeNodes(int[][] arr) {
        List<Integer>ans=new ArrayList<>();
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i,new ArrayList<>());
        }

        for(int i=0;i<arr.length;i++){
            int []temp=arr[i];
            for(int j=0;j<temp.length;j++){
                map.get(temp[j]).add(i);
            }
        }

        Queue<Integer>q=new LinkedList<>();
        int[]out=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int[]temp=arr[i];
            if(temp.length==0) q.add(i);
            out[i]=temp.length;
        }
        
        while(!q.isEmpty()){
            int r=q.poll();
            ans.add(r);
            for(int nbrs:map.get(r)){
                out[nbrs]--;
                if(out[nbrs]==0) q.add(nbrs);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}