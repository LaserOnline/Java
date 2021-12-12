public class Ep_Array_Primitive_DataType_5 
{
    public static void main(String[] args) 
    {
        int [] box = {10,20,30,40,50,60,70,80,90,100};
        

        int sum = 0;

        for(int data:box) //? <------ เข้าถึงข้อมูลทั้งหมดใน Array 
        {
            sum+=data; //? <----- สามานำค่าใน Array ใช้ในการคำนวณได้
        }
        System.out.println("Sum "+sum);
    }
}
