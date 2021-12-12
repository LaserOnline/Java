
public class Ep_Method_String_1
{
    public static void main(String[] args) 
    {

    /*
        *-------------------------------------------------------------------------*
        ! concat ---> คือการต่อ String อีกรูปแบบหนึ่งที่ ไม่จำเป็นต้องใช้ Operater ใช้การ ต่อ String
        ! length ---> หาความยาว String
        ! charAt(Index) ---> หาตำแหน่งตัวอักษร 
        ! (equlas & equalslgnorecase) ---> การเปรียบเทียบ String 
        ! equalsIgnoreCase --> คือการไม่สนใจว่าจะเป็นพิมพ์ใหญ่หรือพิมพ์เล็ก จะสนใจแค่ตรงกันหรือไม่
        ! startsWith --> ใช้ในการ ตรวจหาตัวอักษร คำนำหน้าใน String ได้ ตามที่เรากำหนดไว้
        ! endsWith --> เป็นการตรวจหาคำอยู่ท้าย สุด สามาระบุ ตามที่เรากำหนดได้
        ! indexOf ---> เป็นการค้นหา ตำแหน่งคำ ใน String
        *-------------------------------------------------------------------------*
    */

    //* นิยาม String

        String name = " Mr.James ";
        String name1 = " Mr.JameS ";
        String city = "Bangkok";
    
    //* Concatenation ---> ต่อ String
       
        //! concat ---> คือการต่อ String อีกรูปแบบหนึ่งที่ ไม่จำเป็นต้องใช้ Operater ใช้การ ต่อ String
        String result = name+" City "+city;
        System.out.println(result);
        System.out.println(result.concat("in Thai"));
        //! concat ---> คือการต่อ String อีกรูปแบบหนึ่งที่ ไม่จำเป็นต้องใช้ Operater ใช้การ ต่อ String

        //! length ---> หาความยาว String 
        int count = name.length();
        //* System.out.println(name.length());
        System.out.println(count);
        //! length ---> จะ Return เป็นค่า Integer 


        //! charAt(Index) ---> หาตำแหน่งตัวอักษร 
        System.out.println(name.charAt(3));
        //! String ก็คือ Array Char นั้นเอง ดังนั้น charAt(Index) = Index ตามเลขที่ ตัวอักษร แบบ Array

        //! (equlas & equalslgnorecase) ---> การเปรียบเทียบ String 
        //* ผลของการเปรียบเทียบ จะ Return เป็น ค่าตรรกสตร์ จึงมีแค่ 2 สถานนะ คือ Ture หรือ Flase
        boolean dis = name1.equalsIgnoreCase(name);
            if(dis)
            {
                System.out.println("เหมือนกัน");
            }
            else
            System.out.println("ไม่เหมือนกัน");
        //! equalsIgnoreCase --> คือการไม่สนใจว่าจะเป็นพิมพ์ใหญ่หรือพิมพ์เล็ก จะสนใจแค่ตรงกันหรือไม่

        //! startsWith --> เป็นการตรวจ ว่า คำนำหน้าในตัวแปล chat เป็นคำหยายหรือไม่ หรือ 
        String  chat = "ไอกากเอ้ย";
        boolean checkchat = chat.startsWith("ไอกาก");

            if(checkchat)
                System.out.println("คุณห้ามใช้คำหยาบ");
            else
            
            System.out.println("ไม่มีคำหยาบ");  
        //! startsWith --> ใช้ในการ ตรวจหาตัวอักษร คำนำหน้าใน String ได้ ตามที่เรากำหนดไว้

        //! endsWith --> เป็นการตรวจหาคำอยู่ท้าย สุด ตามที่เรากำหนดได้
        String code = "QZUODOPAXDEPC_TH";
            if(code.endsWith("TH"))
                System.out.println("รหัสการสั้งซื้อสินค้า อยู่ในประเทศ ไทย");
        //! endsWith --> เป็นการตรวจหาคำอยู่ท้าย สุด สามาระบุ ตามที่เรากำหนดได้

        //* indexOf ---> เป็นการค้นหา ตำแหน่งคำ ใน String 
        String text = "Hello World";
        int reTurn = text.indexOf("Java"); //* เป็นการมารับค่า Return จาก indexOf ที่ Return เป็นค่า integer

        boolean checkindex = reTurn < 0 ;
        //* ที่ให้ reTurn < 0 เพราะ indexOf จะ Return เป็นค่า Integer -1 ออกมาเมื่อหาคำใน String ไม่เจอ เหมือนการ Return Array
            if(checkindex)
                System.out.println("ไม่มีคำที่คุณป้อนเข้ามา");

        //* indexOf ---> เป็นการค้นหา ตำแหน่งคำ ใน String 
    }    
}
