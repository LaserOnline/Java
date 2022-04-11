public class Ep_Operator_Prefix_Postfix 
{
    public static void main(String[] args) 
    {
        /*
            ? Operator รูปแบบการเขียน || ความหมาย
            ? ++(Prefix)    ++a    เพิ่มค่าให้ a ก่อน 1 ค่าแล้วนำไปใช้
            ? ++(Postfix)   a++   นำค่าปัจจุบันใน a ไปใช้ก่อนแล้วค่อยเพิ่มค่า
            ? --(Prefix)    --b   ลดค่าให้ b ก่อน 1 ค่าแล้วนำไปใช้ 
            ? --(Postfix)   b--   นำค่าปัจจุบันใน b ไปใช้ก่อนแล้วค่อยลดค่า
        */    

        int a = 5;
        
        //? Prefix

        System.out.println("Prefix :"+a); //? 5
        System.out.println("Prefix :"+(++a)); //? 6  
        System.out.println("เพิ่มค่าให้ก่อน 1 ค่าแล้วนำไปใช้ นั้นคือสาเหตุที่ ค่าเป็น 6");
        System.out.println("Prefix :"+a);  //? 6


        System.out.println("\n");  //? 6
        //? Postfix

        a = 5;

        System.out.println("Postfix :"+a); //? 5
        System.out.println("Postfix :"+(a++)); //? 6  
        System.out.println("นำค่า ปัจจุบัน ไปใช้ก่อน แล้วค่อยเพิ่มค่า นั้นคือสาเหตุที่ ยังคงเป็น 5 อยู่");
        System.out.println("Postfix :"+a);  //? 6
    }
}
