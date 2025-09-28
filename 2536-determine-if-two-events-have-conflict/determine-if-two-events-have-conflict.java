class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        //either event 1 starts before or event 2 starts before
        int a=event2[0].compareTo(event1[1]);
        int b=event1[0].compareTo(event2[1]);
        if(a>0 || b>0) return false;
        // if(event1[1]<event2[0] || event2[1]<event1[0]) return false;
        return true;
    }
}

