class Solution {
    public int countDigitOccurrences(int[] arr, int digit) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            String s=String.valueOf(arr[i]);
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if( (ch-'0')==digit) ans++;
            }
        }
        return ans;
    }
}