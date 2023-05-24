public class thread {

    public static void main(String[] args) {
        Thread name = new Thread(new Hello());
        Thread name1 = new Thread(new hi());
        name.start();
        name1.start();

    }
    
}

class Hello implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}



class hi implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}
