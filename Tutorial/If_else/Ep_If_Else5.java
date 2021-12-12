import java.util.Scanner;

public class Ep_If_Else5 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);

        int manu = 0;

        while (manu == 0)
        {
            System.out.print("ป้อนตัวเลข จำตัวเต็ม :");
            int number = sc.nextInt();

                if(number%2 == 0)
                {
                    System.out.println("เลขคู่ : ");
                }
                else
                {
                    System.out.println("เลขคี : ");
                }   
            System.out.print("ต้องการออกจากโปรแกรม กด 1 ไม่ออก กด 0:");
            manu = sc.nextInt();    
        }
    }    
}
