import java.*;
import java.util.Scanner;

public class Ep_Min_Max_Loop 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int MaxNumber = 0;
        int MinNumber = Integer.MAX_VALUE; 
        //? --> MAX_VALUE = ค่าสุดสูงของ Integer

        while(true)
        {
            System.out.print("Input Number = ");
            int number = kb.nextInt();

                //? ค่าติดลบ ออกจากลูป
                if(number <0 )
                break;

                //? เช็คค่า มากกว่า
                if(number > MaxNumber)    
                    MaxNumber = number;
                
                //? เช็คค่า น้อยกว่า
                if(number < MaxNumber)
                    MinNumber = number;
                

        }
        System.out.println("Max Number = "+MaxNumber);
        System.out.println("Min Number = "+MinNumber);
    }    
}
