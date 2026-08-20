class Solution {
    public int[] resultArray(int[] arr) {
        int n=arr.length;
        ArrayList<Integer>a1=new ArrayList<>();
        ArrayList<Integer>a2=new ArrayList<>();
        int ch=0;
        for(int i=0;i<arr.length;i++){
            if(ch==0){
                if(a1.size()==0) {
                    a1.add(arr[i]);
                    ch=1;
                }
                else if(a1.size()>0 && a2.size()>0){
                    if(a1.get(a1.size()-1)>a2.get(a2.size()-1)){
                        a1.add(arr[i]);
                      
                    }
                    else{
                        a2.add(arr[i]);
                    }
                }
            }
            else{
                a2.add(arr[i]);
                ch=0;
            }
        }
        int[]ans=new int[n];
        int index=0;
        for(int i=0;i<a1.size();i++){
            ans[index++]=a1.get(i);
        }
        for(int i=0;i<a2.size();i++){
            ans[index++]=a2.get(i);
        }
        return ans;
    }
}