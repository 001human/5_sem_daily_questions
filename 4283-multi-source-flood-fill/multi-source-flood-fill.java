class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        Queue<int[]> q = new LinkedList<>();
        int[][]arr=new int[n][m];
        Arrays.sort(sources, (p,y) -> y[2]-p[2]);
        for(int[]s:sources){
            int i=s[0];
            int j=s[1];
            int val=s[2];
            q.add(new int[]{i,j,val});
            arr[i][j]=val;
        }

        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                int[]a=q.poll();
                int r=a[0];
                int c=a[1];
                int val=a[2];

                if(r>0){
                    if(arr[r-1][c]==0){
                        q.add(new int[]{r-1,c,val});
                        arr[r-1][c]=val;
                    }
                }

                if(r<arr.length-1){
                    if(arr[r+1][c]==0){
                        q.add(new int[]{r+1,c,val});
                        arr[r+1][c]=val;
                    }
                }

                if(c>0){
                    if(arr[r][c-1]==0){
                        q.add(new int[]{r,c-1,val});
                        arr[r][c-1]=val;
                    }
                }

                if(c<arr[0].length-1){
                    if(arr[r][c+1]==0){
                        q.add(new int[]{r,c+1,val});
                        arr[r][c+1]=val;
                    }
                }
            }
        }

        return arr;
    }
}