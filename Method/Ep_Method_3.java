import java.text.NumberFormat.Style;
import java.util.Scanner;

public class Ep_Method_3 
{
    public static void main(String[] args) 
    {
        //! Moethod แบบที่ 3 
        //! หลักการทำงาน คือ จะต้องทำงานโดยระบุ ชนิดข้อมูลที่จะส่งไปทำงานที่โปรแกรมหลัก
        //! ถ้าเราทำการ ระบุ ชนิดข้อมูล อยู่หน้า method ต้องทำการ return ชนิดข้อมูล ออกไปด้วย
        //! ถ้ามี void จะไม่มีการ return ออกไป
        //? Progream
        Scanner kb = new Scanner(System.in);
        System.out.print("เงินเดือน ");
        double salary = kb.nextDouble(); //* รับค่าทางคียบอร์ด
        System.out.println("เงินเดือน "+salary);

        //? ทำการรับค่าโบนัส จาก method 
        double bonus = GetBonus(); 

        //? รวม เงินเดือน กับ โบนัส
        salary += bonus;
        System.out.println("เงินเดือน + โบนัส "+salary);
    }

    //? modifier ชนิดข้อมูลที่จะส่งออกมาทำงานในโปรแกรมหลัก ชื่อ เมธอด (){}
    static Double GetBonus()
    {
        return 1000.0;
    }
} 
