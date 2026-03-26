class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        n=(int)Math.pow(10,n);
        return fun(n,"")+1;
    }

    public int fun(int n,String ans){
        int fin=0;

        if(!ans.equals("")){
            if(Integer.parseInt(ans)>=n) return 0;
            fin= 1;
        }
        for(int i=0;i<=9;i++){
            String ch=String.valueOf(i);
            if(ans.equals("") && i==0) continue;
            if(ans.indexOf(ch)!=-1){
                continue;
            }
            fin+=fun(n,ans+ch);
        }
        return fin;
    }
}