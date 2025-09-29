class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer>l=new ArrayList<>();
        int r=arr.length;
        int c=arr[0].length;
        int top=0,bot=r-1,left=0,right=c-1;
        while(top<=bot && left<=right){
            for(int i=left;i<=right;i++){
                l.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                l.add(arr[i][right]);
            }
            right--;

            if(top<=bot){
                for(int i=right;i>=left;i--){
                l.add(arr[bot][i]);
            }
            }
            
            bot--;

            if(left<=right){
                for(int i=bot;i>=top;i--){
                l.add(arr[i][left]);
            }
            }
            
            left++;
        }
        return l;
    }
}