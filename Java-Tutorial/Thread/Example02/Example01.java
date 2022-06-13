import java.lang.Thread;

public class Example01
{
    // * Main Method
    public static void main(String args[])
    {
        try
        {
            for (int i = 0; i < 5; i++)
            {
                Thread.sleep(1000);
                System.out.print(i);
            }
        }
        catch (Exception expn)
        {
            System.out.println(expn);
        }
        
    }
}