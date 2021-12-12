package Java;

public class Ep_Boolean1 
{
    public static void main(String args[])
    {
        boolean t = true;
        boolean f = false;
        System.out.println("Before the return. ");
        if(t)
            return;
        // Compiler Will Bypass every statemnt
        System.out.println("this won't execute.");    
    }
}
