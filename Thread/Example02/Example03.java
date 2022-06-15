class Example03 extends Thread
{
    public void run()
    {
        for (int i = 1; i < 5; i++)
        {
            try {Thread.sleep(500);}
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.print(i);
        }
    }
    public static void main(String args[])
    {
        Example03 t1 = new Example03();
        Example03 t2 = new Example03();

        t1.start();
        t2.start();
    }
}
