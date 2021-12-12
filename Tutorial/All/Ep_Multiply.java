import java.*;
import java.util.Scanner;

public class Ep_Multiply 
{
    public static void main(String[] args) 
    {
        System.out.print("กรุณาป้อน แม่สูตรคูณตั้งแต่ ");
        Scanner kb = new Scanner(System.in);
        int start = kb.nextInt();
        System.out.print("กรุณาป้อน แม่สูตรคูณถึง ");
        int stop = kb.nextInt();

            if(start <=1 || stop <= 1)
                System.out.println("Error");

           for(int m = start; m <= stop; m++)
           {
                
                if(start <=1)
                    break;
                
                   
               System.out.println("แม่ที่ = "+m);

               System.out.println("------------------------------");
                for(int i= 1; i <= 12; i++)
                {
                    System.out.println(m+"x"+i+" = "+(m*i));
                }
           }
    }
}
