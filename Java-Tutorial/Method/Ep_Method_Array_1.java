
import java.text.NumberFormat.Style;
import java.util.Scanner;

public class Ep_Method_Array_1 
{
    public static void main(String[] args) 
    {
            int [] number = {10,20,30,40,50};
            ShowdisplayArray(number); //* ส่งอากิวเมน
        /* 
        //* ------------------------------------------------------
        for (int i=0; i<numberA.length;i++)
        {
            System.out.println("ลำดับ = "+i+" ค่า "+numberA[i]);
        }

        int [] numberB = {-50,-40,-30,-20,10};
        for (int i=0; i<numberB.length;i++)
        {
            System.out.println("ลำดับ = "+i+" ค่า "+numberB[i]);
        }
        //* ------------------------------------------------------
        */

    }    

    static void ShowdisplayArray(int [] numberarr)
    {    
        for(int i=0;i<numberarr.length;i++)
        {
            System.out.println("ตัวที่ = "+i+" เก็บค่า = "+numberarr[i]);

            if(0<numberarr.length)
            System.out.println("--------------------------------------");
        }
     
    }
}
