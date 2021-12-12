
import javax.swing.JOptionPane;

public class Ep_Object1 
{
    public static void main(String args[])
    {
        String numberStr;
        double number, total = 0;
        final int SENTINEL = -999;
        numberStr = JOptionPane.showInputDialog("Enter a number to add (-999 to quit):");
        number = Double.parseDouble(numberStr);
        while (number != SENTINEL)
        {
            total += number;
            numberStr = JOptionPane.showInputDialog("Enter a number to add (-999 to quit) :");
            number = Double.parseDouble(numberStr);
        }
        JOptionPane.showInputDialog(null,"the total is " + total);
        System.exit(0);
    }    
}
