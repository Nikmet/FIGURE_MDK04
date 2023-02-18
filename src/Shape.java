import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent{

    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw(Graphics g);

}
