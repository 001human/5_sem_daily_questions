class Solution {
    static int ans;
    public int orangesRotting(int[][] arr) {
        ans=-1;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==2) q.add(new int[]{i,j});
            }
        }

        while(!q.isEmpty()){
            ans++;
            int s=q.size();
            for(int i=0;i<s;i++){
 
                int[]a=q.poll();
                int r=a[0];
                int c=a[1];
                //trying all 4 directions
                if(r>0){
                    if(arr[r-1][c]==1){
                        q.add(new int[]{r-1,c});
                        arr[r-1][c]=2;
                    }
                }

                if(r<arr.length-1){
                    if(arr[r+1][c]==1){
                        q.add(new int[]{r+1,c});
                        arr[r+1][c]=2;
                    }
                }

                if(c>0){
                    if(arr[r][c-1]==1){
                        q.add(new int[]{r,c-1});
                        arr[r][c-1]=2;
                    }
                }

                if(c<arr[0].length-1){
                    if(arr[r][c+1]==1){
                        q.add(new int[]{r,c+1});
                        arr[r][c+1]=2;
                    }
                }

            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1) return -1;
            }
        }

        return Math.max(0,ans);
    }
}