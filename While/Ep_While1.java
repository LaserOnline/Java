import java.io.IOException;

public class Ep_While1 
{   
    public static void main(String args[]) throws IOException
    {
        int year = 0;
        double balance = 100;

        while(balance <= 10000)
        {
            year++;
            balance *=1.05;
        }
        System.out.println(year);
    }    
}
