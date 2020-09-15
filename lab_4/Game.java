package lab_4;

public class Game implements Priceable {
    private double price;

    public Game(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "price=" + price +
                '}';
    }
}