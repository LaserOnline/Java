
public class Runner {
    public static void main(String[] args) {
        Runnable r1 = new MyThread();
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}

class MyThread implements Runnable{
    public void run(){
        for (int i = 1; i <=10; i++){
            try {
                System.out.println("Thread: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.print(e);
            }
        }
    }
}