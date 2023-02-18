import javax.swing.*;
import java.awt.*;

public class Main extends JComponent {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Drawer");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);
        frame.getContentPane().add(new Main());

        Circle circle1 = new Circle(100, 100, "BLACK");
        circle1.draw(frame.getGraphics());

        Rectangle rect1 = new Rectangle(100, 100, "BLACK");
        rect1.draw(frame.getGraphics());
    }
}