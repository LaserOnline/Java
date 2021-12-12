import java.util.Scanner;

public class Ep_Bath 
{
    public static void main(String[] args) 
    {

    int manu = 0;
    while ( manu == 0)

    { 

        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนจำนวณเงิน = ");
        int money = kb.nextInt();
        System.out.println("จำนวณเงิน = "+money);

        //? เช็คแบงค์ 1000 บาท
        if(money >= 1000)
        {
            System.out.println("1000 = "+money/1000+" ใบ");
                money %= 1000;
        }
        //? เช็คแบงค์ 1000 บาท
            //? เช็คแบงค์ 500 บาท
            if(money >= 500)
            {
                System.out.println("500 = "+money/500+" ใบ");
                    money %= 500;
            }
            //? เช็คแบงค์ 500 บาท
                //? เช็คแบงค์ 100 บาท
                if(money >= 100)
                {
                    System.out.println("100 = "+money/100+" ใบ");
                    money %= 100;
                }
                //? เช็คแบงค์ 100 บาท
                    //? เช็คแบงค์ 50 บาท
                    if(money >= 50)
                        {
                            System.out.println("50 = "+money/50+" ใบ");
                            money %= 50;
                        }
                    //? เช็คแบงค์ 50 บาท
                            //? เช็คแบงค์ 20 บาท
                            if(money >= 20)
                            {
                                System.out.println("20 = "+money/20+" ใบ");
                                money %= 20;
                            }
                            //? เช็คแบงค์ 20 บาท
                                //? เหรียญ 10 บาท
                                if(money >= 10)
                                    {
                                        System.out.println("10 = "+money/20+" ใบ");
                                        money %= 10;
                                    }
                                //? เหรียญ 10 บาท                                   
    }

    }    
}
