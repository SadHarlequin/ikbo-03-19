package practice_2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        System.out.println(ball1.toString());
        Ball ball2 = new Ball(3.3, 3.3);
        System.out.println(ball2);
        ball2.setXY(1.1, 2.2);
        System.out.println(ball2);
        ball2.move(2.1, -3.2);
        System.out.println(ball2.toString());
    }
}
