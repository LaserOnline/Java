public class Ep_Method_1 
{
    public static void main(String[] args) 
    {
        box();
    }   

    //? การเรียกใช้งาน Method ต้องกำหนดให้ Method ให้ตรงกัน Public Static Void เป็น
    //? Static เป็น Method อย่างหนึ่ง หากจะทำการส่งค่า จำเป็นต้อง ให้ตรงกัน
    //? การสร้าง Method

    static void box()
        {
            int a = 10;
            int b = 20;
            int c = 30;
            int sum = a+b+c;
            System.out.println(sum);
        } 
        
}
