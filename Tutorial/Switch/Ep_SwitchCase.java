import java.*;
import java.util.Scanner;
public class Ep_SwitchCase 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("เลขเดือน : ");
        int month = kb.nextInt();

        String name;
       
            switch (month)
            {
                case 1:
                    name = "มกราคม";
                        break;
                case 2:
                    name = "กุมภา";    
                        break;
                case 3:
                    name = "มีนาคม";
                        break;
                default:
                    name = "?";
                    break;                
            }
            System.out.println(name);
    }    
}
