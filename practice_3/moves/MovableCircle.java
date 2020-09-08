package practice_3.moves;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }


    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        this.y+=this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y-=this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x-=this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x+=this.xSpeed;
    }
}
