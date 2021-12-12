
import java.util.Scanner;

public class Ep_Method_Array_Add_Edit_Remove 
{
    public static void main(String[] args) 
    {
        while(true)
        {
           Scanner kb = new Scanner(System.in);
           Scanner Ima = new Scanner(System.in);
           int menu;

        //* ส่วน รับค่า Max Array 
            System.out.print("Your Number Max Array ---> ");
            int array_max = Ima.nextInt();

            String [] array = new String [array_max];

            System.out.println("Max Array  = "+"["+array_max+"]");
        //* ส่วน รับค่า Max Array 

        //*     ส่วน โชว์ Array ว่าเก็บข้อมูลอะไรบ้าง
            for(int i = 0; i < array.length; i++)
            {
                System.out.print("Please Enter ");
                array[i] = kb.nextLine();
                System.out.println("---------------------");
                System.out.println("Index ---> "+i+" = "+array[i]);
                System.out.println("---------------------");
            }
        //*     ส่วน โชว์ Array ทั้งหมด ว่าเก็บข้อมูลอะไรบ้าง

            System.out.println("\n");

            System.out.println("--------------------------------------------");
            System.out.println("ข้อมูลทั้งหมด ");


        //*     โชว์ข้อมูลทั้งหมด
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(" ["+array[i]+"] ");
            }
        //*     โชว์ข้อมูลทั้งหมด


            System.out.println("\n");
            System.out.println("--------------------------------------------");

            //* ลูป Menu
            
                while(true)
                {
                    System.out.println("Please Enter Number ");
                    System.out.println("(1) --------------> Edit");
                    System.out.println("(2) --------------> Remove");
                    System.out.println("(3) --------------> Add");
                    System.out.print("Enter Number --> ");
                    menu = kb.nextInt();
                    System.out.println("\n");

                    //? ----------------------- แก้ไข ------------------------------------------------------

                        if(menu == 1)
                        {
                            System.out.println("\n");

                            Scanner new_sc = new Scanner(System.in);
                            Scanner index_sc = new Scanner(System.in);
                            System.out.println("\n");

                            for(int i = 0; i < array.length; i++)
                            {
                                if(i == 0)
                                    System.out.println("\n");
                                
                                    System.out.println("Index ---> ["+i+"] = "+array[i]);
                            }

                            System.out.print("Mode Please Number Index edit ---> ");
                            int index = index_sc.nextInt();

                            System.out.print("Moede Please Text New ---> ");
                            array[index] = new_sc.nextLine();

                            for(int i = 0; i < array.length; i++)
                            {
                                System.out.print(" ["+array[i]+"] ");
                            }

                            System.out.println("\n");
                        }

                    //? ----------------------- แก้ไข ------------------------------------------------------

                    //?     ลบข้อมูลทั้งหมด ใน Array
                        if(menu == 2 )
                        {
                            System.out.println("\n");

                            for(int i = 0; i < array.length; i++)
                            {
                                array[i] = "";
                            }

                            for (int i = 0; i < array.length; i++)
                            {
                                System.out.print(" ["+array[i]+"] ");
                            }
                            System.out.print("\n");
                        }
                    //?     ลบข้อมูลทั้งหมด ใน Array


                    //?     จากลูป เมนู ไปเริ่มต้นใหม่
                       if(menu == 3)
                       break;

                }
        }        
        
    }
}


                                   