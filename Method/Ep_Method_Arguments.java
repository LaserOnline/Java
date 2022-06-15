
public class Ep_Method_Arguments 
{

    //* Variable Arguments (var-args) 
    //* คือ จะทำงานใน Method ในการรับค่าเข้ามาทำงาน
    //* ในส่วนที่เรียกว่า อากิวเมนต์ แบบ ไม่จำกัดจำนวณ

    //* โค้ค ตัวอย่าง

    /*
    //* modifier type ชื่อ เมธอด ( type...arr){
    
        //* คำสั่ง ต่างๆ
    
    //*  }
    */

    //* Main
    public static void main(String[] args) 
    {
        summation(10,10,10,10,10,50);
    }    
    //* Main

    /*

    //* หาก อยากให้ Method สามา รับ ค่าได้ มากกว่า 2 ค่าขึ้นไป 
    //* สามา สร้าง Method ชื่อเดียวกัน แต่ เพิ่ม การ รับ Parameter ได้เพิ่ม ขึ้น ได้ 
    //* เรียก ว่า Overload

        //* public static void summation(int a, int b,int c,int d)
    //*   {
    //*     int sum = a+b;
    //*     System.out.println(" Sum : "+sum);
    //*   }
    
    //*  ปัญหา คือ ต้องสร้าง Method ขึ้นมา เพื่อ รับ ค่าโดยเฉพาะ ซึ่ง เป็นการ เสียเวลา และเพิ่มการทำงานโดย ไม่จำเป็น
    //* การแก้ปัญหา คือ การสร้าง Variable Arguments (var-args) แบบ ไม่จัดกัด จำนวณ
    */

    public static void summation(int a, int b)
    {
        int sum = a+b; 
        System.out.println(" Sum : "+sum); 
    }

    
    //* Variable Arguments 
    //* หากต้องการ รับ Parameter แบบ ไม่จำกัด จำนวณ ให้ใส่ ... 3 ตัว เพื่อบอกว่า Method นี้ รับ Parameter แบบไม่จำกัด
    
    public static void summation(int...number)
    {
        int sum = 0;
        //* ลูปตาม จำนวณ ที่มี ข้อมูล รับมา 
        for(int i = 0 ; i<number.length; i++)
        {
            sum += number[i];
        }

        System.out.println("Sum : "+sum);
    }
    //* Variable Arguments 
}
