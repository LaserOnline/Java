import java.util.Scanner;

public class Ep_InputTutoria 
{
    public static void main(String[] args) 
    {
        //? รับค่าข้อมูล
        //? ชนิดข้อมูลแบบไหน Integer Float Long Double String Char
        //? ข้อความ อะไร
        //? ข้อความเลข -> คำนวณได้ || คำนวณไม่ได้

        //? กระกาศใช้งาน Class | New

        Scanner sc=new Scanner(System.in);
        System.out.print("String :"); 
        String name=sc.nextLine(); //? รับค่า String จาก แป้นพิมพ์ -> name

        System.out.print("Integer :");
        int Age = sc.nextInt(); //? รับค่า Integer


        System.out.println("String :"+name); //? แสดงข้อความ String
        System.out.println("Integer :"+Age); //? แสดง Integer
    }
}
