package practice_12.ex1;

public class Person {
    private final String name;
    private final String lastName;
    private final String nameFromDad;

    public Person(String name, String lastName, String nameFromDad) {
        this.name = name;
        this.lastName = lastName;
        this.nameFromDad = nameFromDad;
    }

    public String getInfo() {
        return new StringBuilder(lastName)
                .append(name != null && !name.isEmpty() ? " " + name.charAt(0) +"." : "")
                .append(nameFromDad != null && !nameFromDad.isEmpty() ? " " + nameFromDad.charAt(0) +"." : "").toString();
    }
}
