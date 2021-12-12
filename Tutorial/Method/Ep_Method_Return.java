
public class Ep_Method_Return 
{
    public static void main(String[] args) 
    {
        connectServer(200);
    }   
    
    public static void connectServer(int ping)
    {
        //* ปกติ Method ที่เป็น Void จะไม่มีการส่งค่า อะไรออกไป จาก Method
            if(ping > 100)
            {
            //*  หากคำสั่ง ใน Method เจอ Return หยุดทำงานทันที หรือ จะ Return กลับไปเลย ไม่มีการทำงานต่อ
                System.out.println("Connect to Server Fail ");
                return;
            //*  หากคำสั่ง ใน Method เจอ Return หยุดทำงานทันที หรือ จะ Return กลับไปเลย ไม่มีการทำงานต่อ
            }

        System.out.println("Connect to Server Ok ");
    }
}
