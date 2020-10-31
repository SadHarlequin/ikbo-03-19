package lab_9;

public class Exception1 {
    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo1() {
        System.out.println(2 / 0); //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }


    public static void exceptionDemo2() {
        System.out.println(2.0 / 0.0); //Infinity
    }


    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}

