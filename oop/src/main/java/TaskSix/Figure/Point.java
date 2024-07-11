package TaskSix.Figure;

public class Point {
    private double y;
    private double x;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "\nКоординта x = " + x + " Координта y = " + y + ";";
    }
}
