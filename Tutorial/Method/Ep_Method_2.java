
public class Ep_Method_2 
{
    public static void main(String[] args) 
    {

        //! การส่ง อาร์กิวเมนต์ ต้องส่งให้ครบ ตาม พารามิเตอร์ ที่รับค่า ถ้าหากไม่ครบ จะทำให้ใช้งาน ไม่ได้ 

        display("LaserOnline"); //! <----- อาร์กิวเมนต์
        fullName("Laser","Online"); //! <----- อาร์กิวเมนต์
        Number(2000,5000); //! <-------- อาร์กิวเมนต์
    }    

    static void display(String message) //! Message พารามิเตอร์
    {
        System.out.println(message);
    }

    static void fullName (String FName, String LName)
    {
        System.out.println("FirstName "+FName+" LastName "+LName);
    }

    static void Number(int a , int b)
    {
        int c = a+b;
        System.out.println(c);
    }
}
