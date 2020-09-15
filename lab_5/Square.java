package lab_5;

import java.awt.*;

public class Square extends Shape {

    private int side;

    public Square(int x, int y, Color color, int side) {
        super(x, y, color);
        this.side = side;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), side, side);
        g.setColor(Color.BLACK);

    }
}