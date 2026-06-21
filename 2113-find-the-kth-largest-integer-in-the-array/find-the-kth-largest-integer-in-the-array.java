class Solution {
    public String kthLargestNumber(String[] arr, int k) {
        Arrays.sort(arr,(a,b)->{
            if(a.length()==b.length()) return a.compareTo(b);
            return a.length()-b.length();
        });
       
        return arr[arr.length-k];
    }
}