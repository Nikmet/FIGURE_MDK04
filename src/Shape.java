import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent{

    protected JFrame frame;
    protected Graphics g;
    public Shape(){
        this.frame = new JFrame("Рисовалка");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocation(100, 100);
        frame.getContentPane().add(new Shape(){
            @Override
            public void draw() {
                System.out.println("Ready");
            }
        });
        frame.setVisible(true);
        this.g = frame.getGraphics();
    }

    public abstract void draw();
}
