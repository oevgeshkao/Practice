package TaskSecond;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(9, "Blue");

        System.out.println("Square: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println(circle);
    }
}
