class Solution {
    public boolean checkValidString(String s) {
        Stack<Character>st=new Stack<>();
        Boolean[][][]dp=new Boolean[s.length()][s.length()][s.length()];
        return fun(s,0,0,0,dp);
    }

    public Boolean fun(String s,int open ,int close,int i,Boolean[][][]dp){
        if(i==s.length() && open==close ) {
            return true;
        }
        if(i>=s.length() || close>open ) return false;
        if(dp[i][open][close]!=null) return dp[i][open][close];
        Boolean left=false;
        Boolean right=false;
        Boolean mid=false;
        if(s.charAt(i)=='('){
            left=left || fun(s,open+1,close,i+1,dp);
        }
        else if(s.charAt(i)==')'){
            right=right || fun(s,open,close+1,i+1,dp);
        }
        else if(s.charAt(i)=='*'){
            left=left ||fun(s,open+1,close,i+1,dp);
            right = right || fun(s,open,close+1,i+1,dp);
            mid=mid|| fun(s,open,close,i+1,dp);
        }
        return dp[i][open][close]=left||mid||right;
    }

}