
    public class Processor implements Runnable {
        private int value = 0;
        public static void main(String[] args) {
            Processor p1 = new Processor();
            Thread t1 = new Thread(p1, "A");
            Thread t2 = new Thread(p1, "B");
            Thread t3 = new Thread(p1, "C");
            t1.start();
            t2.start();
            t3.start();
    }

        public void run(){
            increment();
        }
        
        public void increment(){
            for (int i = 1; i <= 5; i++){
                value++;
                try{
                    Thread.sleep(100);
                    System.out.println(value+
                    "Thread Name:"+Thread.currentThread().getName());
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        
            }
        }
        
}