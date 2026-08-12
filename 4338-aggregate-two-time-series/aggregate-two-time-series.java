class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] arr1, int[][] arr2) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            int t=arr1[i][0];
            set.add(t);
        }
        for(int i=0;i<arr2.length;i++){
            int t=arr2[i][0];
            set.add(t);
        }
        int s=set.size();
        int[][]ans=new int[s][2];
        int i=0;
        int j=0;
        int idx=0;
        while(i<arr1.length && j<arr2.length){
            int t1=arr1[i][0];
            int t2=arr2[j][0];
            int v1=arr1[i][1];
            int v2=arr2[j][1];
            if(t1==t2){
                ans[idx][0]=t1;
                ans[idx++][1]=v1+v2;
                i++;
                j++;
            }
            else if(t1<t2){
                ans[idx][0]=t1;
                ans[idx++][1]=(v1+v2);
                i++;
            }
            else{
                ans[idx][0]=t2;
                ans[idx++][1]=(v1+v2);
                j++;
            }
        }

        while(i<arr1.length){
            int t1=arr1[i][0];
            int v1=arr1[i][1];
            ans[idx][0]=t1;
            ans[idx++][1]=(v1);
            i++;
        }

        while(j<arr2.length){
            int t2=arr2[j][0];
            int v2=arr2[j][1];
            ans[idx][0]=t2;
            ans[idx++][1]=(v2);
            j++;
        }

        List<List<Integer>>ls=new ArrayList<>();
        for(int k=0;k<ans.length;k++){
            List<Integer>temp=new ArrayList<>();
            temp.add(ans[k][0]);
            temp.add(ans[k][1]);
            ls.add(temp);
        }
        return ls;
    }
}