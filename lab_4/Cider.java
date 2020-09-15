package lab_4;

public class Cider implements Priceable {
    private double price;

    public Cider(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cider{" +
                "price=" + price +
                '}';
    }
}
