
public class Ep_Method_Character 
{
    public static void main(String[] args) 
    {
        /*
        *       Character
        * สร้าง Object Character ด้วย Class
        * isletter = เช็คว่าเป็นตัวอักษรหรือไม่
        * isDigit  = เช็คว่าเป็นตัวเลขหรือไม่
        * isUpperCase, = เช็คว่า ตัวอักษร นั้นเป็นพิมพ์ใหญ่หรือ ไม่
        * isLowerCase = เช็คว่า เป็นตัวอักษร เล็กหรือ ไม่
        * toUpperCase = แปลงจะตัวอักษรพิมพ์เล็ก ให้เป็นพิมพ์ใหญ่
        * toLowerCase = แปลงจะตัวอักษรพิมพ์ใหญ่ ให้เป็นพิมพ์เล็ก
        */

        Character box = new Character ('1');
        char c = 'B';
        char b = 'b';

        System.out.println(Character.isLetter(b)); //* เช็คว่าเป็นตัวอักษรหรือไม่
        System.out.println(Character.isDigit(box)); //*  เช็คว่าเป็นตัวเลขหรือไม่

        System.out.println("\n"); 

            if(Character.isUpperCase(c)) //* เช็คว่าเป็นตัวพิมพ์ใหญ่หรือ ไม่
            {
                System.out.println("พิมพ์ใหญ่ ");
            }
                else
                    System.out.println("พิมพ์เล็ก ");     
            
            if(Character.isLowerCase(b)) //* เช็คว่าเป็นตัวพิมพ์เล็กหรือ ไม่
            {
                System.out.println("พิมพ์เล็ก");
            }
                else
                    System.out.println("พิมใหญ่");
               
        System.out.println("\n");             
              
        System.out.println("Before = "+b);           
        System.out.println("After = "+Character.toUpperCase(b)); //* toUpperCase แปลงพิมพ์เล็กให้เป็นพิมพ์ใหญ่

        System.out.println("\n");

        System.out.println("Before = "+c);           
        System.out.println("After = "+Character.toLowerCase(c)); //* toLowerCase แปลงพิมพ์ใหญ่ให้เป็นพิมพ์เล็ก 

    }    
}
