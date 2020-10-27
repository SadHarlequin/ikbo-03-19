package practice_10.ex1;

public class Test {
    public static void main(String[] args){
        ConcreteFactory factory = new ConcreteFactory();
        System.out.println(factory.createComplex());
        System.out.println(factory.createComplex(5, 10));
    }
}
