package TaskSix;

import TaskSix.Figure.Square;
import TaskSix.Figure.Color;
import TaskSix.Figure.Rectangle;


public class PaintExample {
    public static void main(String[] args) {

        Square square = new Square(9, 8, 6);
        System.out.println("*************");
        square.draw();
        square.draw(Color.BLUE);

        Rectangle rect = new Rectangle(9, 7, 7, 2);
        System.out.println("*************");
        rect.draw();
        rect.draw(Color.RED);
        System.out.println("*************");
        FigureUtil.draw(rect);
        FigureUtil.draw(square, Color.GREEN);

    }
}
