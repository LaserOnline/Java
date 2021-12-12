
import java.awt.*;
import java.awt.event.*;

class Ep_LayoutExample extends WindowAdapter
{
    Frame jf;
    Label label1, label2, lebel3;
    Ep_LayoutExample()
    {
        jf = new Frame("Label Example");

        label1 = new Label("NORTHEAST",Label.RIGHT);
        label2 = new Label("SOUTHWEST",Label.LEFT);
        lebel3 = new Label("CENTRAL",Label.CENTER);

        jf.add(label1,BorderLayout.NORTH);
        jf.add(label2,BorderLayout.SOUTH);
        jf.add(lebel3,BorderLayout.CENTER);

        jf.addWindowListener(this);
        jf.setVisible(true);
        jf.setSize(300,300);
    }
    public static void main(String...ar)
    {
    new Ep_LayoutExample();
    }
    public void windowsClosing(WindowEvent we)
    {
        jf.dispose();
    }
}
