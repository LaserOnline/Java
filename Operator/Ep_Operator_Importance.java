public class Ep_Operator_Importance 
{
    public static void main(String[] args) 
    {
        /*
            ? ลำดับที่      เครื่องหมาย       ลำดับการทำาน
            ? 1             ()          
            ? 2           ++ , --           ซ้ายไปขวา
            ? 3           * , / , %         ซ้ายไปขวา
            ? 4             + , -           ซ้ายไปขวา
            ? 5          <,<=,>,>=          ซ้ายไปขวา
            ? 6             ==, !=          ซ้ายไปขวา
            ? 7             &&              ซ้ายไปขวา
            ? 8             ||              ซ้ายไปขวา
            ? 9        =,+=,-+,*=,/=,%=     ขวาไปซ้าย
            ? หากลำดับความสำคัญของ Operator เท่ากัน จะทำ จาก ซ้ายไปขวา แต่หาก ลำดับสำคัญมาก่อนจะทำจาก ขวาไปซ้าย
        */
        float Num1 = 50, Num2 = 10, Num3 = 15, Num4 = 20;
            
            float AllNum = Num1+Num2/Num3-Num4;

            System.out.print("\t "+Num1);
            System.out.print("\t +"+Num2);
            System.out.print("\t /"+Num3);
            System.out.print("\t -"+Num4);
            System.out.println("\n ====> "+AllNum);

            System.out.println("\n");

            //? เรียงจากซ้ายไปขวา
            float AllNum1 = (Num1+Num2)/(Num3-Num4);
            System.out.print("\t "+Num1);
            System.out.print("\t +"+Num2);
            System.out.print("\t /"+Num3);
            System.out.print("\t -"+Num4);
            System.out.println("\n ====> "+AllNum1);
    }    
}
