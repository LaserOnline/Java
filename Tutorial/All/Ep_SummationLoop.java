import java.*;
import java.util.Scanner;

public class Ep_SummationLoop 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true)
        {
            System.out.print("Input Number = ");
            int number = kb.nextInt();

            if(number <0)
            break;
            
            count++;
            sum+=number;
            number++;
        }    
        System.out.println("Sum "+sum);
        System.out.println("ค่าเฉลี่ย "+(sum/count));
        
    }    
}
