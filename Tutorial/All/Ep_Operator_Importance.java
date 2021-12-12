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
        float Num1 = 50, Num2 = 10, Num3 = 20, Num4 = 15;
            
            float AllNum = Num1+Num2/Num3-Num4;
            System.out.println("จากปกติ (50+10) / (20-15)");
            System.out.println("คิดตามลำดับความสำคัญ--> ( 10 - 20 ) = 0.5 --> ( 50 + 05 ) --> ( 50.5 - 15 )");

            System.out.println("====> "+AllNum);

            System.out.println("\n");

            //? เรียงจากซ้ายไปขวา
            float AllNum1 = (Num1+Num2)/(Num3-Num4);
            System.out.println("====> "+AllNum1);
    }    
}
