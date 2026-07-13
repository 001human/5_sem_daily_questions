class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int s=String.valueOf(low).length();
        int l=String.valueOf(high).length();
        List<Integer>ls=new ArrayList<>();
        int k=1;
        for(int i=s;i<=l;i++){
            int n=0;
            for(int j=k;j<=9;j++){
                n=n*10+j;
                if(String.valueOf(n).length()==i) {
                    if(n>=low && n<=high) ls.add(n);
                    k++;
                    j=k;
                    n=k;
                }
            }
            k=1;
        }
        return ls;
    }
}