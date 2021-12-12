
public class EP_6X 
{
    public static void main(String args [])
    {

        String str1 = new String ("Hello");
        String str2 = new String ("Hello");
        String str3 = new String ("Hello");
        
        System.out.println("Str1 equals to Str2 :"+str1.equals(str2));
        System.out.println("Str1 equals to Str3 :"+str1.equals(str3));
        System.out.println("Str1 equals to Welcome:"+str1.equals("Welcome"));

        String str4 = new String ("apple");
        String str5 = new String ("MANGO");
        String str6 = new String ("APPLE");

        System.out.println("Str4 equals to Str5 :"+str4.equalsIgnoreCase(str5));
        System.out.println("Str4 equals to Str6 :"+str4.equalsIgnoreCase(str6));
        System.out.println("Str4 equals to Welcome:"+str4.equalsIgnoreCase(str6));

        //? equals = เข็คว่า ค่า String ตรงกันหรือไหม 
        
    }
}
