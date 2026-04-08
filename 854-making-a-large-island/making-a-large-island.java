class Solution {
    public int largestIsland(int[][] arr) {
        int idx=2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    int n =fun(arr,i,j,idx);
                    map.put(idx,n);
                    idx++;
                }
            }
        }
        int ans=0;
        int fl=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    fl=1;
                    int n=check(i,j,arr,map)+1;
                    ans=Math.max(ans,n);
                }   
            }
        }
        if(fl==0) return arr.length*arr[0].length;
        return ans;

    }

    public int fun(int[][]arr,int i,int j,int idx){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length) return 0;
        if(arr[i][j]==0 || arr[i][j]!=1) return 0;
        arr[i][j]=idx;
        return 1+fun(arr,i+1,j,idx) + fun(arr,i-1,j,idx) + fun(arr,i,j+1,idx) + fun(arr,i,j-1,idx);   
    }

    public int check(int i,int j,int[][]arr,HashMap<Integer,Integer>map){
        int ans=0;
        HashSet<Integer>set=new HashSet<>();
        if( (i-1)>=0 ){
            int n=arr[i-1][j];
            if(n!=0 && !set.contains(n)){
                ans+=map.get(n);
                set.add(n);
            } 
        }

        if(i+1<arr.length){
            int n=arr[i+1][j];
            if(n!=0 && !set.contains(n)){
                ans+=map.get(n);
                set.add(n);
            } 
        }

        if( (j-1)>=0){
            int n=arr[i][j-1];
            if(n!=0 && !set.contains(n)){
                ans+=map.get(n);
                set.add(n);
            } 
        }

        if(j+1<arr[0].length){
            int n=arr[i][j+1];
            if(n!=0 && !set.contains(n)){
                ans+=map.get(n);
                set.add(n);
            } 
        }
        return ans;
    }
}