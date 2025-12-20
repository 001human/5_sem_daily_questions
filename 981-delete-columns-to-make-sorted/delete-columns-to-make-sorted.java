class Solution {
    public int minDeletionSize(String[] arr) {
        String s=arr[0];
        int ans=0;
        for(int i=0;i<s.length();i++){
            String temp=s.charAt(i)+"";
            for(int j=1;j<arr.length;j++){
                String st=arr[j];
                temp=temp+st.charAt(i);
            }
            System.out.println(temp);
            for(int j=1;j<temp.length();j++){
                if((j-1)>=0 && temp.charAt(j-1)>temp.charAt(j)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}