class Solution {
    public int[][] kClosest(int[][] arr, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            return a[0]-b[0];
        });

        for(int i=0;i<arr.length;i++){
            int sq=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
            pq.add(new int[]{sq,i});
        }

        int[][]ans=new int[k][2];
        int i=0;
        while(k-->0){
            int idx=pq.poll()[1];
            ans[i++]=arr[idx];
        }
        return ans;
    }
}