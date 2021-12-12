public class Ep_Operator_Basic 
{
    public static void main(String[] args) 
    {
        /*
            ? Operator | ตัวดำเนินการทางคณิตศาสตร์
            ? | + | - | * | % |
            ? |บวก|ลบ|คูณ|หาร|หารเศษ| 
        */    
        int a = 10;
        int b = 5;

        System.out.println("ใส่ () บวก "+(a+b));
        System.out.println("ไม่ใส่ () บวก "+a+b);
        
        //? หาก เจอ Operator + + ติดกัน ให้ทำการ () เพื่อบอกว่าทำอะไรก่อน
        //? หากไม่ทำ การใส่ () เพื่อบอกว่าต้องทำอะไรก่อน จะทำให้แสดง [ผลบวก105 แทนที่จะแสดง ผลบวก15]
    }    
}
