import java.util.Scanner;

public class Ep_Temperature 
{
    public static void main(String[] args) 
    {
        //! C = (F-32)x5/9
        //! F = (C x 9/5)+32
        int menu = 0;
        while (menu == 0)
        {
            Scanner kb = new Scanner(System.in);
            System.out.print("ป้อนอุณหภูมิ (ฟาเรนไฮน์)");

            float fahren = kb.nextFloat();
            float cel = (fahren-32)*5/9;

                System.out.println(fahren+" องศาฟาเรนไฮน์ = "+cel+" องศาเซลเซียส");

                    System.out.print("ป้อนอุณหภูมิ (เซลเซียส)");
                    float cel1 = kb.nextFloat();
                    float fahren1 = (cel1*9/5)+32;

                    System.out.println(cel1+" องศาเซลเซียส = "+fahren1+" องศาฟาเรนไฮน์");
        }
    }    
}
