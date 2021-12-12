public class Ep_ConversionDataType 
{
    public static void main(String[] args) 
    {
        //? การแปลง ชนิดข้อมูล จาก เล็กไป ---> มาก
        int NumType1 = 10;
        double NumType2=NumType1;
    
        System.out.println("---> ชนิดเดิม :"+NumType1);
        System.out.println("---> ทำการแปลง :"+NumType2);
        //? การแปลง ชนิดข้อมูล จาก เล็กไป ---> มาก   


        //? การแปลง ชนิดข้อมูล จาก มากไป ---> เล็ก

        double NumType3 = 10;
        int    NumType4=(int)NumType3;

        System.out.println("---> ชนิดเดิม :"+NumType3);
        System.out.println("---> ทำการแปลง :"+NumType4);
        
        //? การแปลงชนิดข้อมูล จาก มากไป ---> เล็ก

    }
}
