import java.text.NumberFormat.Style;

public class Ep_Method_CopyArray 
{
    public static void main(String[] args) 
    {

        int [] Array = {10,20,30,40,50};

        int [] copy = CopyArray(Array);

            //*
                System.out.print(" Array : ");
                ShowArray(Array);

                System.out.println("\n");

                System.out.print(" Copy Array : ");
                ShowArray(copy);
            //*    

    }     

    //* โชว์ ข้อมูลใน Array ทั้งหมด
    static void ShowArray(int [] Array)
    {
        for(int i=0; i<Array.length;i++)
        {
            System.out.print("\t"+Array[i]);
        }
    }
    //* โชว์ ข้อมูลใน Array ทั้งหมด



    static int [] CopyArray(int [] a)
    {

    //* สร้าง Array เปล่า เพื่อ มารับ ค่า Array ที่ส่งเข้า นั้นดัง Array ที่เราสร้างขึ้นมา จึงมีค่าเท่ากับที่ ส่งเช้ามา
        int []newArray = new int [a.length];  
        
        //* ลูป Array เพื่อ เก็บ ค่า ลงใน ตัวแปล newArray ที่ละตัว

        for(int i=0; i<a.length; i++)
        {
            //* เก็บที่ละ ตัว ตามเลข Index
            newArray[i] = a[i];
            //* เก็บที่ละ ตัว ตามเลข Index

        }

        //* ลูป Array เพื่อ เก็บ ค่า ลงใน ตัวแปล newArray ที่ละตัว

        return newArray; //* Return ค่า ออกไป เป็นชนิด Integer

    }

} 
