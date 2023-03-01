public class Main {
    public static void main(String[] args) {
        Shape[] arr = {new Circle(1, 2), new Rectangle(0,10), new Circle(10, 10)};
        for(Shape shape: arr){
            shape.draw();
            System.out.println();
        }
    }
}