public class Ep_Array_Primitive_DataType_6 
{
    public static void main(String[] args) 
    {
        String [][]box = { 
            //?     0             1             2                    3
                {"Iphone x", "Iphone 11", "Iphone 11 Pro", "Iphone 11 ProMax"}, //? 0
            //?     0             1                     2                    
                {"Iphone 12", "Iphone 12 Pro", "Iphone 12 Pro Max"},            //? 1
            //?     0             1                     2
                {"Iphone 13", "Iphone 13 Pro", "Iphone 13 Pro Max"}             //? 2
                        };

            //? Box [เลขแถว] [เลขคอลัมน์]              
            System.out.println(box[2][2]); //? <---------- Index

            box [2][2] = "หมด"; //? เปลียนค่าใน Index 
            System.out.println("After = "+box[2][2]);                        
    }
}
