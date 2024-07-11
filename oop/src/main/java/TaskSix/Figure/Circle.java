package TaskSix.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, double x, double y) {
        super(new Point(x, y), "Круг");
        this.radius = radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}


