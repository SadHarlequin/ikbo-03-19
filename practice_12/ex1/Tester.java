package practice_12.ex1;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person("Mikhail", "Nikitin", "Evgen'evich");
        Person p2 = new Person("", "Nikitin", null);
        Person p3 = new Person("", "Nikitin", "Evgen'evich");
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());
    }
}
