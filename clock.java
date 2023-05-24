
public class clock {
    int hrs,min,sec;

    public clock(int hrs,int min,int sec){
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    public void settime(int hrs,int min,int sec){
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }


    public void gettime(){
      System.out.println(hrs +":"+ min + ":" + sec);
    }





    public static void main(String[] args) {
        clock c = new clock(4, 25, 32);
        c.gettime();
        c.settime(1,25,60);
        c.gettime();
        
    }
    
}
