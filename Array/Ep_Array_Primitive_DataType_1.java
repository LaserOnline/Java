public class Ep_Array_Primitive_DataType_1 
{
    public static void main(String[] args) 
    {
        //? การสร้าง Array

        //? แบบกำหนดขนาดเอาไว้
        int []number = new int [4];
        number [0] = 10;
        number [1] = 20;
        number [2] = 30;
        number [3] = 40;

        System.out.println("---> แบบที่ 2 Max Array "+number[3]);
        //? แบบกำหนดสมาชิก

        int []numberx = {10,20,30,40,50};
        System.out.println("---> แบบที่ 3 Max Array "+numberx[4]);
        numberx [4] = 100;
        System.out.println("---> แบบที่ 3 Max Array "+numberx[4]);


    }    
}
