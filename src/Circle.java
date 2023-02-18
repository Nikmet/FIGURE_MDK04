import javax.swing.*;
import java.awt.*;

public class Circle extends Shape{

    @Override
    public void draw() {
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 100,100);
    }
}
