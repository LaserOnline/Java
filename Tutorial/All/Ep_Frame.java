import java.awt.*;

class Ep_Frame 
{
    
    Frame frame;
    Label label;
    Button button;

    Ep_Frame() 
    {
        frame = new Frame("Kaochiam");
        label = new Label("Vigrantont");
        button = new Button("Button");

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);
        frame.setSize(210, 250);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new Ep_Frame();
    }

}