public class Ep_Operator_Compound_Assignment 
{
    public static void main(String[] args) 
    {
        /*
        ? Assignment รูปแบบการเขียน ความหมาย
        ? +=        x+y     x=x+y
        ? -=        x-=y    x=x-y
        ? *=        x*=y    x=x*y
        ? /=        x/=y    x=x/y
        ? %=        x%=y    x=x%y
        */

        int x = 10, y = 5; 
        System.out.println("X = 10 Y = 5 ก่อนคำนวณ: "+x);
        x=x+y;
        System.out.println("x = x+y หลังคำนวณ: "+x);
        x=10;
        y=5;
        
        System.out.println("\n");
        System.out.println("X = 10 Y = 5 ก่อนคำนวณ: "+x);
        x=x-y;
        System.out.println("x = x-y หลังคำนวณ: "+x);
    }
}
