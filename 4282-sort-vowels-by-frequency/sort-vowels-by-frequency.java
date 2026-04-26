class Solution {
    public String sortVowels(String s) {
        int[][]arr=new int[26][4];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(fun(ch)==false) continue; 
            int idx=ch-'a';
            arr[idx][0]++;
            arr[idx][2]++;
            if(arr[idx][0]==1) arr[idx][3]=i;
            arr[idx][1]=idx;//to find whcih character has how much freq
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]) return a[3]-b[3];
            return b[0]-a[0];
        });
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int curi=ch-'a';
            if(fun(ch)==false) sb.append(ch);
            else {
                    while (idx < 26 && arr[idx][2] == 0) idx++;
                
                        arr[idx][2]--;
                        sb.append((char)(arr[idx][1]+'a'));
                      
            }
        }
        return sb.toString();
    }

    public boolean fun(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
}