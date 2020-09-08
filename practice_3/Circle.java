package practice_3;

public class Circle extends Shape{
    protected double radius;

    public Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*2;
    }
    @Override
    public String toString(){
        return "Circle{" + "color='" + color + '\'' + ", filled=" + filled + ", radius= "+radius+ ", area= "
        + getArea()+", perimeter="+getPerimeter()+'}';
    }
}
