
public class Ep_Method_4 
{
    public static void main(String[] args) 
    {
        //? โปรแกรม หลัก
        int result1 = maxNumber(50,100);
        int result2 = minNumber(50,100);
        int sum = summation(minNumber(50,100), maxNumber(50,100));
        System.out.println("ค่ามากที่สุด "+result1);
        System.out.println("ค่าน้อยที่สุด "+result2);
        System.out.println("รวมค่าทั้งหมด "+sum);
    }    

    /*
    //* ชนิดข้อมูลที่ จะส่งออกไป ชื่อ เมธอด (ค่าที่ส่งเข้ามา){
    //* การประมวลผล
    //* return ชนิดข้อมูล
    //* }
    */
    static int maxNumber(int a, int b)
    {
    //? ค่ามากสุด
        if( a==b )
        {
            return a;
        }
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }  
    }
    //? ค่าน้อยสุด
    static int minNumber(int a, int b)
    {
        if( a==b )
        {
            return a;
        }
        if(a<b)
        {
            return a;
        }
        else
        {
            return b;
        }  
    }
    static int summation(int x, int y)
    {
        int total = x+y;
        return total;
    }
}
