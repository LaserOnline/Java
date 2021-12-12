package Java;

public class Ep_Boolean2 
{
    public static void main(String args[]) 
    {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break statement.");
                    if(t)
                        break second;
                    System.out.println("This won't execute.");    
                }
                System.out.println("This won't execute.");
            }
            System.out.println("This is after second block.");
        }
    }       
}
