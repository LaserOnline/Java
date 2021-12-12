
public class Ep_Array_Primitive_DataType_2 
{
    public static void main(String[] args) 
    {
        int []number = {10,20,30,40,50,60};
        int size = number.length; //? เก็บจำนวณ Array
        System.out.println("Integer Array "+number.length); //? <---- เช็คจำนวณ Array
        System.out.println("Integer Size Array "+size);

        boolean[] status = {true,false,true,false};
        System.out.println("Boolean Array "+status.length);

        String [] fruits = {"แมว","หมา","ปลา","หมี","นก"};
        System.out.println("String Array "+fruits.length);
    }
}
