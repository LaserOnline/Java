public class Example04 extends Thread
{
    public void run()
    {
        System.out.print("Running");
    }
        public static void main(String args[])
        {
            Example04 t1 = new Example04();

            t1.start();
            //t1.start(); //* Output  RunningException in thread "main" java.lang.IllegalThreadStateException
        }
}
