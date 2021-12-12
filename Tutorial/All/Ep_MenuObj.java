import java.awt.*;
import java.awt.event.*;

public class Ep_MenuObj implements ActionListener
{
Frame frame ; 
MenuBar menuBar ; 
Menu menu1 ,menu2 ; 
MenuItem mItem1 , mItem2 , mItem3 , mItem4 , mItem5 ,mItem6 , mItem7 ;
FileDialog fg; 
Label label1 ; 

Ep_MenuObj()
{
    frame = new Frame("JDialog");

    menuBar = new MenuBar();

    menu1 = new Menu("File");
    mItem1 = new MenuItem("New");
    mItem2= new MenuItem("Open");
    mItem3 = new MenuItem("Save");
    mItem4 = new MenuItem("Exit");

    menu1.add(mItem1);
    menu1.add(mItem2);
    menu1.add(mItem3);
    menu1.add(mItem4);

    menu2 = new Menu("Save-as");
    mItem5 = new MenuItem(".jpeg"); 
    mItem6 = new MenuItem(".png"); 
    mItem7 = new MenuItem(".pdf"); 

    menu2.add(mItem5);
    menu2.add(mItem6);
    menu2.add(mItem7);

    menu1.add(menu2);

    menu1.add(mItem4);

    menuBar.add(menu1);

    mItem2.addActionListener(this);
    mItem4.addActionListener(this);

    label1 = new Label("", Label.CENTER); 

    frame.setMenuBar(menuBar);
    frame.add(label1,BorderLayout.CENTER);
    frame.setSize(370,270);
    frame.setVisible(true);
}
    public  void actionPerformed(ActionEvent ae) 
{
    if(ae.getActionCommand().equals("Open"))
    {
    fg = new FileDialog(frame,"Open a file");
    fg.setVisible(true);
    String file = fg.getDirectory()+ fg.getFile();
    label1.setText("File to Open - "+file) ; 
    }
    if(ae.getActionCommand().equals("Exit"))
    {
    System.exit(0);
    }
}
    public static void main(String... ar) 
{
    new Ep_MenuObj();
}

}