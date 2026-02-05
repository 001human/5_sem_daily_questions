class Solution {
    public List<String> invalidTransactions(String[] arr) {
        int n=arr.length;
        String []name=new String[n];
        String[]city=new String[n];
        int[]time=new int[n];
        int[]amount=new int[n];
        for(int i=0;i<arr.length;i++){
            String[]temp=arr[i].split(",");
            name[i]=temp[0];
            time[i]=Integer.parseInt(temp[1]);
            amount[i]=Integer.parseInt(temp[2]);
            city[i]=temp[3];
        }

        List<String>ans=new ArrayList<>();
        HashSet<Integer>ls=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(ls.contains(i)) continue;
            int fl=0;
            for(int j=0;j<arr.length;j++){
                if(name[j].equals(name[i]) && !city[i].equals(city[j]) && Math.abs(time[i]-time[j])<=60){
                    fl=1;
                    ls.add(j);
                }
                else if(amount[j]>1000){
                    ls.add(j);
                }
            }
            if(fl==1) ls.add(i);
        }

        for(int n1:ls){
            ans.add(arr[n1]);
        }
        return ans;
    }
}