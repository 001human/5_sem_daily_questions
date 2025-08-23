class Solution {
    public int halveArray(int[] arr) {
        int k=arr.length;
        PriorityQueue<Double>pq=new PriorityQueue<>((a,b)->Double.compare(b,a));
        double total=0;
        for(int i=0;i<arr.length;i++){
            pq.add((double)arr[i]);
            total+=(double)arr[i];
        }
        int ans=0;
        double score=0;
        while(k-->0){
            double x=pq.poll();
            score+=x/2.0;
            pq.add(x/2.0);
            ans++;
            if(score>=total/2){
                break;
            }
        }
        return ans;
    }
}