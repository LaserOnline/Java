public class Ep_Break_Continue 
{
    public static void main(String[] args) 
    {
        //! For ใช้ในกรณีรู้จำนวนรอบที่ชัดเจน
        //! While ใช้ในกรณีที่ไม่รู้จักรอบที่ชัดเจน
        //! Do While ใช้ในกรณีที่อยากให่ลองทำก่อน 1 รอบ
        //! แล้วทำซ้ำไปเรื่อยๆ ทราบเท่าที่เงื่อนไขเป็นจริง 

        //! Break = ถ้าโปรแกรม พบคำสั่งนี้จะหลุดออกจากการทำงานในลูปทันที เพื่อ ไปทำคำสั่งอื่นที่่อยู่นอกลูป
        //! Continue = คำสั่งนี้จะทำให้หยุดการทำงานแล้วย้อนกลับไปเริ่มต้นการทำงานที่ต้นลูปใหม่    

        for(int i = 1; i <= 10; i++)
        {   
            System.out.println("Break "+i);
            if(i == 5)
            break;
        }

        for(int y = 1; y <= 10; y++)
            {
                if(y == 5)
                continue;
                System.out.println("Continue "+y);
            }
    }    
}
