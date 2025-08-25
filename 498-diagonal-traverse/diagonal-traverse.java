class Solution {
    public int[] findDiagonalOrder(int[][] arr) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int s=i+j;
                if(!map.containsKey(s)){
                    map.put(s,new ArrayList<>());
                }
                map.get(s).add(arr[i][j]);
            }
        }

        int []ans=new int[n*m];
        int index=0;
        for(Map.Entry<Integer,List<Integer>>entry:map.entrySet()){
            List<Integer>temp=new ArrayList<>();
            if(entry.getKey()%2==0){
                temp=entry.getValue();
                Collections.reverse(temp);
            }
            else{
                temp=entry.getValue();
            }
            for(int i=0;i<temp.size();i++){
                ans[index++]=temp.get(i);
            }
        }
        return ans;       
    }
}