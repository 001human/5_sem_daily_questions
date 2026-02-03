class MyCalendarThree {
    List<int[]>arr;
    public MyCalendarThree() {
        arr=new ArrayList<>();
    }
    
    public int book(int start, int end) {
        int[] s = new int[]{start, 1};
        int[] e = new int[]{end, -1};
        arr.add(s);
        arr.add(e);
        Collections.sort(arr,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];   
        });
        int cur=0;
        int max=0;
        for(int i=0;i<arr.size();i++){
            cur += arr.get(i)[1];
            max=Math.max(max,cur);
        }
        return max;
    }
}