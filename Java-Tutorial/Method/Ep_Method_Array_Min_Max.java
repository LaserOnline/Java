
import java.text.NumberFormat.Style;

public class Ep_Method_Array_Min_Max 
{
    public static void main(String[] args)  //* หากไม่ทำการ Static ตรง Method จะไม่สามา รับค่ามายังใน Main ได้
    {

        int [] numberA = {10,20,30,40,50};
        System.out.println("Max Array = "+ ShowMax(numberA)+" ค่ามากที่สุด"); //* ทำการ ส่ง ค่าไปยัง Method เพื่อเช็คว่า ค่าไหนมากที่สุด และ Return กลับมา
        System.out.println("Max Array = "+ ShowMin(numberA)+" ค่าน้อยที่สุด");//* ทำการ ส่ง ค่าไปยัง Method เพื่อเช็คว่า ค่าไหนน้อยที่สุด และ Return กลับมา
        System.out.println("Location Index = "+ Position(numberA)+" :");
        System.out.println("\n");
        int [] numberB = {-50,-40,-30,-20,-10};
        System.out.println("Max Array = "+ ShowMax(numberB)+" ค่ามากที่สุด"); //* ทำการ ส่ง ค่าไปยัง Method เพื่อเช็คว่า ค่าไหนมากที่สุด และ Return กลับมา
        System.out.println("Max Array = "+ ShowMin(numberB)+" ค่าน้อยที่สุด");//* ทำการ ส่ง ค่าไปยัง Method เพื่อเช็คว่า ค่าไหนน้อยที่สุด และ Return กลับมา
        System.out.println("Location Index = "+ Position(numberB)+" :");

        System.out.println("\n");
        System.out.println("Array Equal == "+compareArray(numberA,numberB)); //* ส่ง อากิวเมนต์ ไปที่ Method แล้วรับค่า Return แสดง 

    }    

    static int ShowMax(int [] Array) //* Method เป็นเป็นชนิด Integer
    {
        //* ค้นหาค่าที่มากที่สุดใน Array
        int MaxArray = Array[0]; //* เก็บค่าสุดสูงเอาไว้ บนสุด
        for(int i=0; i<Array.length;i++) //* ลูป Array
        {
            if(Array[i]>MaxArray) //* หากเจอ ค่าทีมากกว่า ใน Array ให้ทำ
            {
                MaxArray = Array[i]; //* MaxArray จะทำการเก็บ ค่าใน Array ทีมากที่สุด
            }
        }
        return MaxArray; //* Return เป็นค่า Integer
    }

    static int ShowMin(int [] Array)
    {
        //* ค้าหาค่าที่น้อยที่สุด
        int MinArray = Array [0]; //* ทำการเก็บค่าที่น้อยที่สุด ใน Array ที่ตำแหน่ง 0
        for (int i=0; i<Array.length;i++) //* ลูป Array
        {
            if(Array[i]<MinArray) //* ทำการเช็ค ข้อมูลใน Array ว่าค่าไหนน้อยที่สุด || 50 ---> ชึ้ยังทุกค่าใน Array หาค่าไหนน้อยที่สุด
            MinArray = Array[i]; //* ค่าไหนน้อยที่สุด เก็บใน MinArray 
        }
        return MinArray; //* Return ชนิด ข้อมูล Integer
    }

    static int Position(int [] Array)
    {
        //* ค้นหาตำแหน่ง Array ของค่าที่ มากที่สุด และ || ค่าที่น้อยที่สุด

        int MaxIndex = 0; //* เก็บตำแหน่ง Index สมาชิกที่มีค่ามาที่สุดใน Array
        for (int i=0; i<Array.length;i++)
        {
            if(Array[i]>Array[MaxIndex]) //* ค่าไหนมากที่สุดใน ตำแหน่ง Array จะเก็บค่านั้น 
            {
                MaxIndex = i; //* MaxIndex จะเก็บค่า  I ซึ่ง คือ ตำแหน่งของ Index
            }
        }
        return MaxIndex; //* Return ค่า MaxIndex 
    }

    static boolean compareArray(int [] a, int [] b)
    {
        if(a.length != b.length) //* ดัก Error หาก ค่าใน Array ไม่เท่ากันเพื่อป้องกัน การ Error 
        return false; //* ให้ Return False ไปเลย หาก if ข้างบนเป็นจริง

        for(int i=0;i<a.length;i++) //* I น้อยกว่า ในตัวแปล Array อยู่แล้ว จะทำการลูปตามจำนวณในข้อมูล Index
        {
            if(a[i] == b[i]) //* เช็ค Array ใน Parameter ที่ส่งมา ว่าเท่ากันหรือไม่ หากเท่า กัน ให้ Return True
            {
                return true; //* Return True เป็นชนิด Boolean
            }
        }
        return false; //* Return False เป็นชนิด Boolean
    }
    
}
