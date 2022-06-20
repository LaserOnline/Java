
public class Runner {
    public static void main(String[] args) {
        Thread t1 = new Thread( new Runnable() {
            public void run(){
                for (int i=1; i<=6; i++){
                    try{
                        System.out.println("Thread1: "+i);
                        Thread.sleep(500);
                    }catch (InterruptedException a){
                        System.out.println(a);
                    }
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
           public void run(){
            for (int i=1; i<=5; i++){
                try{
                    System.out.println("Thread2: "+i);
                    Thread.sleep(500);
                }catch (InterruptedException a){
                    System.out.println(a);
                }
            }
           }
        });
        t2.start();
    }
}

