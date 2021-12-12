package Java;

public class Ep_While5 
{
    public static void main(String args[]) 
	{
		
		int x = 100,
        atm = 10000;
		int i = 0;
		while (x <= atm){
			x += (x*(1.05/100));
			i++;
		}
			System.out.println("balance: "+ x +" bath in "+ i+" year\n\n");
	}
}
