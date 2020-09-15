package lab_5;

import java.awt.*;

public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(getColor());
        g.fillOval(getX(),getY(),2*radius,2*radius);
        g.setColor(Color.BLACK);
    }
}
