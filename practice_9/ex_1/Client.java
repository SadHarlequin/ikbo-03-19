package practice_9.ex_1;

public class Client {
    private final String name;
    private final String lastName;
    private final String secondName;
    private final String inn;

    public Client(String name, String lastName, String secondName, String inn) {
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getInn() {
        return inn;
    }

    public void check(String INN) throws INNException {
        if(!INN.equals(this.inn)) throw new INNException();
    }
}
