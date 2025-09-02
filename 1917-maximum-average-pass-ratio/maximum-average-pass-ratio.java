class Solution {

    class pair{
        double data;
        int index;
        pair(double data,int index){
            this.data=data;
            this.index=index;
        }
    }

    public double maxAverageRatio(int[][] arr, int ex) {
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->Double.compare(b.data,a.data));
        for(int i=0;i<arr.length;i++){
            double pr=(double)arr[i][0]/arr[i][1];
            double npr=(double)(arr[i][0]+1)/(arr[i][1]+1);
            double dif=npr-pr;
            pq.add(new pair(dif,i));
        }

        while(ex-->0){
            pair r=pq.poll();
            int i=r.index;

            arr[i][0]++;
            arr[i][1]++;

            double pr=(double)arr[i][0]/arr[i][1];
            double npr=(double)(arr[i][0]+1)/(arr[i][1]+1);
            double dif=npr-pr;

            pq.add(new pair(dif,i));

        }

        double ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=(double)arr[i][0]/arr[i][1];
        }
        return ans/arr.length;
    }
}