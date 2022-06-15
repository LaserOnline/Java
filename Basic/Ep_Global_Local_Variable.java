public class Ep_Global_Local_Variable 
{
    public static void main(String[] args) 
    {
        //? Global Variable = คือ ตัวแปลอิสระ ที่สามารถใช้ได้แบบ ไม่มีขอบเขตการทำงาน
        int NumX = 10;
        int NumY = 5;
        //? Global Variable = คือ ตัวแปลอิสระ ที่สามารถใช้ได้แบบ ไม่มีขอบเขตการทำงาน
        
        {
            //? Local Variable = คือ ตัวแปลที่ มีการทำงาน แบบ มีขอบเขต ไม่สามาใช้นอกจากขอบเขตได้
            int NumZ = 15;
            System.out.println("Local Variable: "+NumZ);
            //? Local Variable = คือ ตัวแปลที่ มีการทำงาน แบบ มีขอบเขต ไม่สามาใช้นอกจากขอบเขตได้
        }    

        System.out.println("Global Variable: "+NumX);
        System.out.println("Global Variable: "+NumY);
    }
}
