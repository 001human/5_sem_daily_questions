class Solution {
    public int[][] sortTheStudents(int[][] arr, int k) {
        int n=arr.length;
        int m=arr[0].length;
        TreeMap<Integer,Integer>map=new TreeMap<>();
        int[]temp=new int[n];
        for(int i=0;i<n;i++){
            map.put(arr[i][k],i);
        }
        int [][]ans=new int[n][m];
        int i=n-1;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int x=entry.getValue();
                for(int j=0;j<m;j++){
                    ans[i][j]=arr[x][j];
                }
                i--;
            
        }
        return ans;
    }
}