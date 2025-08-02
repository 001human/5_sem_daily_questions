class Solution {
    public long makeSimilar(int[] arr, int[] target) {
        List<Integer>e1=new ArrayList<>();
        List<Integer>e2=new ArrayList<>();
        List<Integer>o1=new ArrayList<>();
        List<Integer>o2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) e1.add(arr[i]);
            else o1.add(arr[i]);
            if(target[i]%2==0) e2.add(target[i]);
            else o2.add(target[i]);
        }
        Collections.sort(e1);
        Collections.sort(o1);
        Collections.sort(e2);
        Collections.sort(o2);
        long ans=0;
        for(int i=0;i<e1.size();i++){
            if(e1.get(i)>e2.get(i)){
                ans+=(e1.get(i)-e2.get(i))/2;
            }
        }
        for(int i=0;i<o1.size();i++){
            if(o1.get(i)>o2.get(i)){
                ans+=(o1.get(i)-o2.get(i))/2;
            }
        }
        return ans;
    }
}