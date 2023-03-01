import java.awt.*;

public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("*****************");
    }

    public void equals() {
    }
}