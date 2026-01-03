class Solution {
    public int findChampion(int n, int[][] arr1) {
        int[]arr=new int[n];
        for(int i=0;i<arr1.length;i++){
            int b=arr1[i][1];
            arr[b]++;
        }
        ArrayList<Integer>fin=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) fin.add(i);
        }
        if(fin.size()>=2 || fin.size()==0) return -1;
        return fin.get(0);
    }
}