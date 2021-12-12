public class Ep_Char_And_String 
{
    public static void main(String[] args) 
    {
        //? Char จะเก็บตัวอักษร ได้แค่ ตัวเดียว
        char a='A';
        System.out.println("ชนิด Char "+a);

        //? String จะเก็บตัวอักษร ได้หลายตัว เป็นชุดข้อความ
        String Str="ABCDEFG";
        System.out.println("ชนิด String "+Str);

        //? String to Integer
        String Strx = "100";
        int Strz;
        Strz=Integer.parseInt(Strx);
        Strz=Strz+50;
        System.out.println("String to Integer: "+Strz);
        //? String to Integer

        //? String to Double
        String StrNum = "150";
        double StrDouble=Double.parseDouble(StrNum);
        StrDouble=StrDouble+50;
        System.out.println("String to Double: "+StrDouble);
        //? String to Double

        //? การใช้ String ในการคำนวณต่าง ได้ 

        int NumInt = 50;
        String NumStr = String.valueOf(NumInt);
        System.out.println("Integer to String : "+NumStr);
    }
}
