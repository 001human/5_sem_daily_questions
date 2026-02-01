class RideSharingSystem {
    Queue<Integer>rider;
    Queue<Integer>driver;
    HashSet<Integer>set;
    public RideSharingSystem() {
        rider=new LinkedList<>();
        driver=new LinkedList<>();
        set=new HashSet<>();
    }
    
    public void addRider(int riderId) {
        rider.offer(riderId);
        set.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        
        while(!rider.isEmpty() && !set.contains(rider.peek())) rider.poll();
        if(rider.isEmpty() || driver.isEmpty()) return new int[]{-1,-1};
        return new int[]{driver.poll() , rider.poll()};
    }
    
    public void cancelRider(int riderId) {
        set.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */