package Java;

public class Ep_While4 
{
    public static void main(String args[]) 
	{
		
		int x = 100,res = 10000;
		int i = 0;
		while (x <= res){
			x += (x*(1.05/100));
			i++;
		}
			System.out.println("balance: "+ x +" bath in "+ i+" year\n\n");
	} 
}
