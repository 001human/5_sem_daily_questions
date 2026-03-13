class Solution {
    static int minx;
    static int miny;
    static int maxx;
    static int maxy;
    public int[][] findFarmland(int[][] arr) {
        List<List<Integer>>fin=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                minx=i;
                miny=j;
                maxx=i;
                maxy=j;
                if(arr[i][j]==1){
                    fun(arr,i,j);
                    List<Integer>temp=new ArrayList<>();
                    temp.add(minx);
                    temp.add(miny);
                    temp.add(maxx);
                    temp.add(maxy);
                    fin.add(temp);
                }
            }
        }
        int[][]ans=new int[fin.size()][4];
        for(int i=0;i<fin.size();i++){
            ans[i][0] = fin.get(i).get(0);
            ans[i][1] = fin.get(i).get(1);
            ans[i][2] = fin.get(i).get(2);
            ans[i][3] = fin.get(i).get(3);
        }
        return ans;
    }

    public void fun(int[][]arr,int i,int j){
        if(i>=arr.length || j>=arr[0].length || i<0 || j<0 || arr[i][j]==0) return;
        arr[i][j]=0;
        minx=Math.min(minx,i);
        miny=Math.min(miny,j);
        maxx=Math.max(maxx,i);
        maxy=Math.max(maxy,j);
        fun(arr,i+1,j);
        fun(arr,i-1,j);
        fun(arr,i,j+1);
        fun(arr,i,j-1);
    }
}