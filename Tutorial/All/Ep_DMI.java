import java.util.Scanner;
public class Ep_DMI 
{
    public static void main(String[] args) 
    {
        //? Average Directional Movement Index

        Scanner sc=new Scanner(System.in);

        System.out.print("ป้อนน้ำหนัก (Kg) : ");
        double weight=sc.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm) : ");
        double height=sc.nextDouble();

        height/=100; //? Height = Height/100

        double bmi = weight/(height*height);
        //? น้ำหนัก หารด้วยความสูง

        System.out.println("น้ำหนัก (Kg) : "+weight);
        System.out.println("ส่วนสูง (Cm) : "+height);
        System.out.println("ค่าดัชนีมวลกาย (BMI) : "+bmi);

        String predict = "";

        /*
            ? น้อยกว่า 18 = ต่ำกว่าเกณฑ์
            ? 18.5 -> 22.9 = สมส่วน
            ? 23.0 -> 24.9 = น้ำหนักเกิน
            ? 25.0 -> 29.9 = โรออ้วน
            ? มากว่า 30 =      โรคอ้วนระดับอัตราย
        */

        // ? ต่ำกว่าเกณฑ์
            if(bmi<18)
            {
                predict="ต่ำกว่าเกณฑ์";
            }
        // ? ต่ำกว่าเกณฑ์
        
        // ? สมส่วน
            else if (bmi >= 18.5 && bmi <= 22.9)
            {
                predict = "สมส่วน";
            }
        // ? สมส่วน
        
        // ? น้ำหนักเกิน
            else if (bmi >= 23.0 && bmi <= 24.9)
            {
                predict = "น้ำหนักเกิน";
            }
        // ? น้ำหนักเกิน

        // ? โรออ้วน
            else if (bmi >= 25.0 && bmi <= 29.9)
            {
                predict = "โรคอ้วน";
            }
        // ? โรออ้วน
        
        // ? โรคอ้วนระดับอัตราย
            else if (bmi >= 30.0 && bmi <= 70.0)
            {
                predict = "โรคอ้วนระดับอันตราย";
            }
        // ? โรคอ้วนระดับอัตราย

        // ? ไม่ทราบค่า
            else 
            {
                predict = "Error";
            }
        // ? ไม่ทราบค่า

        System.out.println("โปรแกรมคำนวณระบุบว่าคุณ = "+predict);

    } 
}
