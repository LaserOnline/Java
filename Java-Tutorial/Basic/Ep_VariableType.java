import javax.management.InstanceNotFoundException;

public class Ep_VariableType 
{
    public static void main(String[] args) 
    {
        Integer a = 10;
        Double b = 11.1;
        String c = "World"; 
        Character e = 'x';
        //Float f;

            //! เป็น = (True) ไม่เป็น = (False)
            //boolean result = c instanceof String; //? เป็นการเช็คว่า ตัวแปลเป็น Type String หรือเปล่า
            //boolean result = b instanceof Double; //? เป็นการเช็คว่า ตัวแปลเป็น Type Double หรือเปล่า
            //boolean result = a instanceof Integer; //? เป็นการเช็คว่า ตัวแปลเป็น Type Integer หรือเปล่า
            //boolean result = f instanceof Float; //? เป็นการเช็คว่า ตัวแปลเป็น Type Float หรือเปล่า
            boolean result = e instanceof Character; //? เป็นการเช็คว่า ตัวแปลเป็น Type Character หรือเปล่า
            System.out.println(result);
    }
}
