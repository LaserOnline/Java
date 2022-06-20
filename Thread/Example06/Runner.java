
public class Runner {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

class MyThread extends Thread{
    public void run(){
        for ( int i =0; i <= 10; i++){
            try {
                System.out.println("Thread: " + i);
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}