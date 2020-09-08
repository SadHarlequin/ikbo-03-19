package lab3;

public class toy_Terrier extends Dogs {

    public toy_Terrier(String name, String colour, int age) {
        super(name, colour, age);
    }
    @Override
    public String toString() {
        return "Той терьер {"+"имя = " + getName() + " возраст = " + getAge() + " лет " + "цвет = " + getColour() + " }";
    }
}
