package TaskSix.Figure;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width, double x, double y) {
        super(new Point(x, y), "Прямоугольник");

        this.height = height;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return height * 2 + width * 2;
    }
}
