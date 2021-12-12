
public class Ep_NestedLoop 
{
    public static void main(String[] args) 
    {
        //? Loop นอก
        for (int i = 1; i <= 2; i++)    
        {
            
            //? Loop นอก
            //? Loop For จะเริ่มตั้งแต่ Loop นอก เมื่อ เจอ Loop ใน

            System.out.println("Loop For นอก รอบที่ = "+i);

                //? Loop ใน
                for(int j = 1; j <= 2; j++)
                {
                    System.out.println("Loop For ใน รอบที่ = "+j);
                    //? For Loop ใน จะทำจนกว่าจะครบรอบ ถึงจะ ออกจาก Loop ใน
                }
        }

        //? Loop นอก
            int x = 1, y = 1;

            while(x <= 5)
            {
                System.out.println("Loop While นอก รอบที่ = "+x);

                    //? Loop ใน
                    while(y <= 2)
                    {
                        System.out.println("Loop While ใน รอบที่ = "+y);
                        y++;
                        //? หากไม่มีการ รีเช็ต ค่าตัวแปลใน Loop ใน While จะทำการลูปจนรอบที่กำหนด
                        //? แล้ว เมื่อ มาเจอ ลูปใน จะทำการข้าม ลูปเพราะ มันตรงเงือนไข แล้ว
                    }
                    x++;
            }
    }
}
