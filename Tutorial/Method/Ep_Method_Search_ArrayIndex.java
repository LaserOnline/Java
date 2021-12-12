public class Ep_Method_Search_ArrayIndex 
{
    public static void main(String[] args) 
    {

        int [] number = {10,20,30,40,50,60};
        // * System.out.println("Index : "+search(number, 60)+" : ");

        String [] strArray = {"Iphone X", "Iphone 11", "Iphone 11 Pro", "Iphone 11 Pro Max"};
        System.out.println("Index : "+searchStr(strArray, "Iphone 11 Pro Max"));
    }    

    //* ค้นหา Index Array Integer
    static int search(int [] Array , int index)
    {
        for(int i = 0; i < Array.length; i++)
        {
            if(Array[i] == index)
            {
                return i;
            }
        }
        return -1;
    }
    //* ค้นหา Index Array Integer

    static int searchStr(String [] Array , String index)
    {
        for(int i = 0; i < Array.length; i++)
        {
            //* หากทำการ เทียบ String จะไม่ใช้ Operator ใช้ การเทียบ 
            //* แต่จะใช้ คำสั้ง equals แทน equals ใช้ในการ เทียบ String
            if(Array[i].equals(index)) 
            {
                return i;
            }
        }
        return -1;
    }
}
