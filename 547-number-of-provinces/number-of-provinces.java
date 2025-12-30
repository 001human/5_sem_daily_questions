class Solution {
    static int c;
    public int findCircleNum(int[][] arr) {
        c=0;
        bft(arr);
        return c;
    }

    public void bft(int[][]arr){
        HashSet<Integer>visit=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        for (int i=0;i<arr.length;i++){
            if (visit.contains(i)) continue;
            c++;
            q.add(i);
            while (!q.isEmpty()) {
                //remove
                int r=q.poll();
                //check if already visted
                if (visit.contains(r)) continue;
                //add visted
                visit.add(r);
                //self work
                // if (r==dest) System.out.println(true);
                //add nbrs if unvisited
                for (int j=0;j<arr[0].length;j++){
                    if (!visit.contains(j) && arr[r][j]==1) q.add(j);
                }
            }
        }
    }
}