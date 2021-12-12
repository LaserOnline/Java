public class Ep_Operator_Boolean 
{
    public static void main(String[] args) 
    {
        /*
            ? ตัวดำเนินการเปรียบเทียบ
            ? ชนิด Boolean

            ?  == | เท่ากับ
            ? != | ไม่เท่ากับ
            ? > | มากกว่า
            ? < น้อยกว่า
            ? >= | มากกว่าเท่ากับ
            ? <= | น้อยกว่าเท่ากับ
        */
        int a = 10;
        int b = 5;

        System.out.println(a+"มีค่าเท่ากับ"+b+"หรือไม่ ? "+(a==b));
        System.out.println(a+"ไม่เท่ากับ"+b+"หรือไม่ ? "+(a!=b));
        System.out.println(a+"มากกว่า"+b+"หรือไม่ ? "+(a>b));
        System.out.println(a+"น้อยกว่า"+b+"หรือไม่ ? "+(a<b));
        System.out.println(a+"มากกว่าเท่ากับ"+b+"หรือไม่ ? "+(a>=b));
        System.out.println(a+"น้อยกว่าเท่ากับ"+b+"หรือไม่ ? "+(a<=b));

        /*
            ? && | AND
            ? || | OR
            ? ! | NOT

        */
        System.out.println("------------------------------");

        int NumMAX = 20;
        int NumMIN = 10;

        System.out.print("Opertor AND :");
        System.out.println((NumMIN==NumMAX));
        //? ถ้าหากเงือนไขตรงกัน ให้แสดง ว่า True แต่หาก ไม่ตรง ให้แสดงว่า False นั้นคือ Operator AND

        System.out.print("Opertor OR :");
        System.out.println((NumMIN==NumMAX) || (NumMIN<NumMAX));
        //? อย่างใด อย่างหนึ่งเป็นจริง จะแสดง True  นั้นคือ Opertor OR

        System.out.print("Opertor NOT :");
        System.out.println((NumMIN!=NumMAX));
        //? ถ้าหากเงือนไข ไม่ตรงกัน ให่ แสดง True แต่หากตรงกัน ให้แสดงว่า False นั้นคือ Operator NOT
    }
}
