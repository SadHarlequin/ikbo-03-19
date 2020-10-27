package practice_12.ex3;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String info) {
        String[] data = info.split(",");
        this.id = data[0];
        this.name = data[1];
        this.color = data[2];
        this.size = data[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "\nid='" + id + '\'' +
                ", \nname='" + name + '\'' +
                ", \ncolor='" + color + '\'' +
                ", \nsize='" + size + '\'' +
                '}';
    }
}
