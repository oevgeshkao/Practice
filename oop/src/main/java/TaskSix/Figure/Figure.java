package TaskSix.Figure;

public abstract class Figure implements Drawable {
    public Point point;
    private String name = "Фигура";

    public abstract double area();

    public abstract double perimeter();

    public Figure(Point point, String name) {
        this.point = point;
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: " + name + " " + point);
    }

    @Override
    public void draw(Color color) {
        System.out.println("Фигура: " + name + " Цвет: " + color.getName() + " " + point);
    }

}
