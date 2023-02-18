import javax.swing.*;
import java.awt.*;

public class Rectangle extends Shape{



    public Rectangle(){

    }

    @Override
    public void draw() {
        g.setColor(Color.BLACK);
        g.drawRect(100, 100,100, 100);
    }
}
