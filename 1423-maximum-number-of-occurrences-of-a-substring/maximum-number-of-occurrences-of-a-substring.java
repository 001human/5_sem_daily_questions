class Solution {
    public int maxFreq(String s, int maxl, int min, int max) {
        int ans=0;
        // for(int i=min;i<=max;i++){  
            //instead of loopinig over min to max we can simply loop over min as max will always contain min and we can get more min substring thna max ones
            HashMap<String,Integer>map=new HashMap<>();
            for(int j=0;j<=s.length()-min;j++){
                String temp=s.substring(j,j+min);
                if(valid(temp,maxl)){
                    map.put(temp,map.getOrDefault(temp,0)+1);
                }
            }
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                ans=Math.max(ans,entry.getValue());
            }
        // }
        return ans;        
    }

    public boolean valid (String s,int maxl){
        int[]arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        int a=0;
        for(int i=0;i<26;i++){
            if(arr[i]>0) a++;
        }
        if(a<=maxl) return true;
        return false;
    }
}