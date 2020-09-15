package lab_5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Tester extends JFrame {
    public static int nextX=20;
    public static int nextY=45;
    public static final int width=1200;
    public static final int height = 700;

    public static Shape getRandomShape(){
        Random random = new Random();
        int placeX = random.nextInt(width-750);
        int placeY = random.nextInt(height-400);
        int length =random.nextInt(50)+20;
        Color clr = getRandomColor(random.nextInt(10));

        switch (random.nextInt(2)){
            case 0:
                return new Circle(placeX, placeY, clr, length/2);
            case 1:
                return new Square(placeX,placeY,clr,length);
            default:
                return new Circle(placeX, placeY, clr, length/2);
        }
    }

    private static Color getRandomColor(int i) {
        switch (i) {
            case 0:
                return Color.BLACK;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.CYAN;
            case 3:
                return Color.DARK_GRAY;
            case 4:
                return Color.GREEN;
            case 5:
                return Color.GRAY;
            case 6:
                return Color.MAGENTA;
            case 7:
                return Color.ORANGE;
            case 8:
                return Color.PINK;
            case 9:
                return Color.RED;
            default:
                return Color.YELLOW;
        }
    }

    public Tester(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane panel = getLayeredPane();
        for (int j = 0; j < 20; j++) {
            Shape figure = getRandomShape();
            figure.setBounds(0, 0, width, height);
            panel.add(figure);
        }
        setSize(width, height);
        setVisible(true);
    }

    public static void main(String[] args){
        new Tester();
    }
}
