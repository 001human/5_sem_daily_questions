class Solution {
    public int[][] diagonalSort(int[][] arr) {
        HashMap<Integer,PriorityQueue<Integer>>map=new HashMap<>();
        //each diagonal has unique key
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int k=i-j;
                map.putIfAbsent(k,new PriorityQueue<>());
                map.get(k).add(arr[i][j]);
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int k=i-j;
                int t=map.get(k).poll();
                arr[i][j]=t;
            }
        }
        return arr;
    }
}