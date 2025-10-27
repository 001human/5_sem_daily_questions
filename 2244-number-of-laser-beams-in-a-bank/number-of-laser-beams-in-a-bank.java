class Solution {
    public int numberOfBeams(String[] arr) {
        List<Integer>arr1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int o=0;
            String s=arr[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1') o++;
            }
            arr1.add(o);
        }

        int ans=0;
        int pre=arr1.get(0);
        for(int i=1;i<arr1.size();i++){
            ans=ans+(pre*arr1.get(i));
            if(pre*arr1.get(i)!=0 || pre==0) pre=arr1.get(i);

        }
        return ans;

    }
}