package lab_5;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {

    private int x;
    private int y;
    private Color color;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        setOpaque(false);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}