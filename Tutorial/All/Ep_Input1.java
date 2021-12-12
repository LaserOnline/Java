
import java.util.Scanner;

public class Ep_Input1
{
    public static void main(String args[])
    
    { 
        while (true)    
        {
        
        //?     รับค่าชนิดข้อมูล Int
        Scanner sc=new Scanner(System.in);
        System.out.print("รับค่าชนิด integer :");
        int i=sc.nextInt();   //!   <------ ชนิดข้อมูล Int
        System.out.println("แสดงผลหน้าจอ :"+i);

        //?     รับค่าชนิดข้อมูล String
        Scanner st=new Scanner(System.in);
        System.out.print("รับค่าชนิด String :");   
        String name=st.nextLine();   //!   <------ ชนิดข้อมูล String
        System.out.println("แสดงผลหน้าจอ :"+name);

        }
    }
}
