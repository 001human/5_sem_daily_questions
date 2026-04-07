class Robot {
    static int[][]arr;
    static String s;
    static int x;
    static int y;
    public Robot(int width, int height) {
        arr=new int[height][width];
        s="East";
        x=0;
        y=0;
    }
    
    public void step(int num) {
        int r=arr.length;
        int c=arr[0].length;
        //perimeter = 2*(l+b)-4
        int p=2*(arr.length+arr[0].length)-4;
        num=num%p;
        if(num==0) num=p;
        while(num>0){

        if(s.equals("East")){
            if(x+num>=c){
                num-=(c-1-x);
                x=c-1;
                s="North";
            }
            else{
                x+=num;
                num=0;
            }
        }

        else if(s.equals("West")){

            if(x-num<0){
                num-=x;
                x=0;
                s="South";
            }
            else{
                x-=num;
                num=0;
            }
        }

        else if(s.equals("North")){

            if(y+num>=r){
                num-=(r-1-y);
                y=r-1;
                s="West";
            }
            else{
                y+=num;
                num=0;
            }
        }

        else {

            if(y-num<0){
                num-=y;
                y=0;
                s="East";
            }
            else{
                y-=num;
                num=0;
            }
        }

        }
        
    }
    
    public int[] getPos() {
        return new int[]{x,y};
    }
    
    public String getDir() {
        return s;
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */