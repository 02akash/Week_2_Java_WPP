class Worker1 implements Runnable{

    public void run(){

        for(int i= 1; i<=20; i++){
            System.out.println("thread one is working");
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Worker2 implements Runnable{
    

    public void run(){

        for(int i= 1; i<=20; i++){
            System.out.println("Hello form Thread Two");

            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Test0{

    Thread t1, t2;
    Test0(){

            t1 = new Thread(new Worker1());
            t2 = new Thread(new Worker2());

            t1.setPriority(5);
            t2.setPriority(10);

            t1.start();
            t2.start();
    }

    public static void main(String[] args) {
        new Test0();
    }
}
