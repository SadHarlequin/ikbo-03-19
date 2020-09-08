package lab3;

public abstract class Dogs {
    private String name;
    private String colour;
    private int age;

    public Dogs(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}