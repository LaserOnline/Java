
public class Ep_Array_Primitive_DataType_7 
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

            for(int row = 0; row < box.length; row++) //? Loop แถว
            {

                for(int column = 0; column < box [row].length; column++) //? Loop คอลัม
                {
                    System.out.println("Row = "+row+" Column "+column+" String = "+box[row][column]);
                }

            }

    }
}
