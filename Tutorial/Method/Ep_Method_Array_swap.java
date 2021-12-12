public class Ep_Method_Array_swap 
{
        public static void main(String[] args) 
        {
            int [] number = {100,50,30};

            ShowArray(number);
            SwapArray(number,2,0);
            System.out.println("\n");
            ShowArray(number);
        }    

    static void ShowArray(int [] Array)
    {
        for(int i=0; i<Array.length;i++)
        {
            System.out.print("\t"+Array[i]);
        }
    }

    static void SwapArray(int []a, int x, int y)
    {
        //* x ตำแหน่งเริ่มต้น
        //* y ตำแน่งปลายทาง
        //* temp จัดเก็บตำแหน่งชั่วคราว

        int temp = a[x]; //* เก็บค่าเริ่มแรกเอาไว้ก่อ 
        a[x] = a[y]; //* ทำการ เก็บ ค่าใน Index y ไป x
        a[y] = temp; //* ให้ y เก็บค่าที่อยู่ในตัวแปลเริ่มแรกที่เราเก็บค่าเอาไว้
    }
}
