package shape.calculator;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
