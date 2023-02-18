import java.awt.*;

public class Circle extends Shape{

    private int x;
    private int y;
    public Circle(int x, int y, String color){
        super(color);
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Graphics g) {
        g.drawOval(x,y,100,100);
        g.setColor(Color.getColor(color));
    }
}
