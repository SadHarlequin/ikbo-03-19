package praktika1;

public class Nikitin_Mikhail_ball {
    private String color;
    private int price;
    private double weight;
    private String material;

    public Nikitin_Mikhail_ball(double weight, String material, String color, int price) {
        this.weight = weight;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", material=" + material + ", weight=" + weight + ", price=" + price + '}';
    }
}
