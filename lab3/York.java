package lab3;

public class York extends Dogs{
    public York(String name, String colour, int age) {
        super(name, colour, age);
    }
    @Override
    public String toString() {
        return "Йорк {"+"имя = " + getName() + " возраст = " + getAge() + " лет " + "цвет = " + getColour() + " }";
    }
}

