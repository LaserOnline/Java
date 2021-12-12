
import java.awt.*;
import java.applet.Applet;

class Ep_AppletDemo extends Applet
{
    private Font font;
    public void init()
    {
        setBackground(Color.blue);
        font = new Font ("Arial",Font.BOLD,50);
    }
    public void paint ( Graphics g)
    {
        g.setColor(Color.pink);
        g.setFont(font);
        g.drawString(Amazing, Thailand, 30,100);
    }
}
