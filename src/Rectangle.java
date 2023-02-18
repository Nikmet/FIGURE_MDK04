import java.awt.*;

public class Rectangle extends Shape{

    private int x;
    private int y;
    public Rectangle(int x, int y, String color){
        super(color);
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.getColor(color));
        g.drawRect(x,y,100,100);
    }
}
