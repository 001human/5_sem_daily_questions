class MyCalendar {
    List<int[]>arr;
    public MyCalendar() {
        arr=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        int[] s = new int[]{start, 1};
        int[] e = new int[]{end, -1};
        arr.add(s);
        arr.add(e);
        Collections.sort(arr,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];   
        });
        int cur=0;
        for(int i=0;i<arr.size();i++){
            cur += arr.get(i)[1];
            if(cur >1){
                arr.remove(s); // removes object (ACCEPS INDEX AND OBJECT BOTH)
                arr.remove(e);
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */