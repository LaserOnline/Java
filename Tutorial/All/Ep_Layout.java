import java.awt.*;
import javax.swing.*;

class Ep_Layout 
{
    private JFrame fr;
    private JButton bt1,bt2,bt3;
    public void init()
    {
        fr = new JFrame("Button Example");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout());
        
        bt1 = new JButton("Submit");
        bt2 = new JButton("Cancel");
        bt3 = new JButton("Exit");

        fr.add(bt1);
        fr.add(bt2);
        fr.add(bt3);
        fr.setSize(200,150);
        fr.setVisible(true);
    }
    public static void main(String args[])
    {
    Ep_Layout obj = new Ep_Layout();
    obj.init();
    }
}
